package com.example.dbens_000.backtrackscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onCustomizeAlertsButtonClick(View v){

        Intent myIntent = new Intent(this, CustomizeAlerts.class);
        startActivity(myIntent);

    }

    public void onEditProfileButtonClick(View v){

        //Intent myIntent = new Intent(this, EditProfile.class);
        //startActivity(myIntent);

    }

    public void onSignOutButtonClick(View v){

        //Intent myIntent = new Intent(this, SignOut.class);
        //startActivity(myIntent);

    }

    public void onEditThresholdButtonClick(View v){

        //Intent myIntent = new Intent(this, EditThreshold.class);
        //startActivity(myIntent);

    }
}
