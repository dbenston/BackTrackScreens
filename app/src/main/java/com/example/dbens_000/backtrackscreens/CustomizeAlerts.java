package com.example.dbens_000.backtrackscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;

public class CustomizeAlerts extends AppCompatActivity {

    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_alerts);

        switch1 = (Switch) findViewById(R.id.switch1);

    }


    public void onBackButtonClick(View v){

        Intent myIntent = new Intent(this, MainMenu.class);
        startActivity(myIntent);

    }

    public void onSaveButtonClick(View v){

        Intent myIntent = new Intent(this, MainMenu.class);
        startActivity(myIntent);

    }

    public void onEditButtonClick(View v){

    }

    public void onAddButtonClick(View v){

    }

}
