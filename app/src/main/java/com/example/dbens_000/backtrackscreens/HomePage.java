package com.example.dbens_000.backtrackscreens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    private TextView age_text;
    private TextView height_text;
    private TextView weight_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Bundle profData = getIntent().getExtras();

        if(profData == null)
            return;

        String ageString = profData.getString("ageData");
        String footString = profData.getString("footData");
        String inchesString = profData.getString("inchesData");
        String weightString = profData.getString("weightData");

        age_text = (TextView)findViewById(R.id.ageText);
        age_text.setText(ageString);

        height_text = (TextView)findViewById(R.id.heightText);
        height_text.setText(footString + "' " + inchesString + '"');

        weight_text = (TextView)findViewById(R.id.weightText);
        weight_text.setText(weightString + " lbs");


    }

    public void onSignOutButtonClick(View v){

        //Intent myIntent = new Intent(this, SignOut.class);
        //startActivity(myIntent);

    }

}
