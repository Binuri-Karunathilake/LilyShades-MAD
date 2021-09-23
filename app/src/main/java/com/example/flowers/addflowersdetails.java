package com.example.flowers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addflowersdetails extends AppCompatActivity {

    TextView textView7, textView10, textView8, textView9;
    EditText editTextTextPersonName6, editTextTextPersonName3, editTextTextPersonName7;
    Button button4, button5;
    RadioGroup radioGroup;
    RadioButton radioButton, radioButton2, radioButton3, radioButton4;
    DatabaseReference dbref;
    Flowers flw;


    //override
    protected void onCreate(Bundle postBouquet){
        super.onCreate(postBouquet);
        setContentView(R.layout.activity_addflowersdetails);

        textView7 = findViewById(R.id.textView7);
        textView10 = findViewById(R.id.textView10);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);

        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName7 = findViewById(R.id.editTextTextPersonName7);

        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);

        flw = new Flowers();
    }

    //Method to clear all user inputs
    private void clearControls(){
        editTextTextPersonName6.setText("");
        editTextTextPersonName3.setText("");
        editTextTextPersonName7.setText("");
    }

    public void createDetails(View view){
        dbref = FirebaseDatabase.getInstance().getReference().child("Flowers");
        try{
            if (TextUtils.isEmpty(editTextTextPersonName6.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter Bouquet Name", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(editTextTextPersonName3.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter cost for bouquet", Toast.LENGTH_SHORT).show();
            else {
                //Take inputs from the user and assigning them to this instance (flw) of thw Flower...
                flw.setBouquetName(editTextTextPersonName6.getText().toString().trim());
                flw.setCostForBouquet(Double.parseDouble(editTextTextPersonName3.getText().toString().trim()));
                flw.setMarketPrice(Double.parseDouble(editTextTextPersonName7.getText().toString().trim()));

                //Insert in to the database
                dbref.push().setValue(flw);

                //Feedback to the user via a Toast...
                Toast.makeText(getApplicationContext(), "Data Saved Successfully", Toast.LENGTH_SHORT).show();
                clearControls();
            }
        }
        catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Invalid Price Format", Toast.LENGTH_SHORT).show();
        }
    }
}