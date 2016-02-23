package com.example.dbens_000.backtrackscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateProfile extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText age;
    private EditText foot;
    private EditText inches;
    private EditText weight;
    private EditText username;
    private EditText password;
    private EditText passwordCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        firstName = (EditText)findViewById(R.id.firstNameBox);
        lastName = (EditText)findViewById(R.id.lastNameBox);
        age = (EditText)findViewById(R.id.ageBox);
        foot = (EditText)findViewById(R.id.footBox);
        inches = (EditText)findViewById(R.id.inchesBox);
        weight = (EditText)findViewById(R.id.weightBox);
        username = (EditText)findViewById(R.id.usernameBox);
        password = (EditText)findViewById(R.id.passwordBox);
        passwordCheck = (EditText)findViewById(R.id.passwordCheckBox);

            }

    public void onButtonClick(View v){
        Intent myIntent = new Intent(this, HomePage.class);

        String firstNameString = firstName.getText().toString();
        String lastNameString = lastName.getText().toString();
        String ageString = age.getText().toString();
        String footString = foot.getText().toString();
        String inchesString = inches.getText().toString();
        String weightString = weight.getText().toString();
        String usernameString = username.getText().toString();
        String passwordString = password.getText().toString();


        myIntent.putExtra("ageData", ageString);
        myIntent.putExtra("footData", footString);
        myIntent.putExtra("inchesData", inchesString);
        myIntent.putExtra("weightData", weightString);


        startActivity(myIntent);
    }
    }
