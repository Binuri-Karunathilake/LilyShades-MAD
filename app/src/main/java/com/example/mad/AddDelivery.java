package com.example.mad;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddDelivery extends AppCompatActivity {
    //Initialize
    EditText etFname, etSname, etAddl1, etAddl2, etCity, etRegion, etContact;
    Button btn_addDelivery;

    Delivery del;
    //Firestore instance
    DatabaseReference database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_delivery);
        getSupportActionBar().hide();
        Toast.makeText(AddDelivery.this, "Firebase connection is successful", Toast.LENGTH_LONG).show();

        //initialize views with its xml
        etFname = findViewById(R.id.et1_fName);
        etSname = findViewById(R.id.et1_sName);
        etAddl1 = findViewById(R.id.et1_address1);
        etAddl2 = findViewById(R.id.et1_address2);
        etCity = findViewById(R.id.et1_city);
        etRegion = findViewById(R.id.et1_regionState);
        etContact = findViewById(R.id.et1_contact);

        btn_addDelivery = findViewById(R.id.btn1_addAddress);

        del = new Delivery();

        //click button to add data
        btn_addDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //firestore
                database = FirebaseDatabase.getInstance().getReference().child("Delivery");
                openActivity2();
                try {
                    if (TextUtils.isEmpty(etFname.getText().toString().trim()))
                        Toast.makeText(getApplicationContext(), "Please Enter First Name", Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(etSname.getText().toString().trim()))
                        Toast.makeText(getApplicationContext(), "Please Enter Second Name", Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(etAddl1.getText().toString().trim()))
                        Toast.makeText(getApplicationContext(), "Please Enter Address Line 1", Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(etAddl2.getText().toString().trim()))
                        Toast.makeText(getApplicationContext(), "Please Enter Address Line 1", Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(etCity.getText().toString().trim()))
                        Toast.makeText(getApplicationContext(), "Please Enter City", Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(etRegion.getText().toString().trim()))
                        Toast.makeText(getApplicationContext(), "Please Enter Region", Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(etContact.getText().toString().trim()))
                        Toast.makeText(getApplicationContext(), "Please Enter Contact", Toast.LENGTH_SHORT).show();
                    else {
                        del.setfName(etFname.getText().toString().trim());
                        del.setsName(etSname.getText().toString().trim());
                        del.setAddLine1(etAddl1.getText().toString().trim());
                        del.setAddLine1(etAddl2.getText().toString().trim());
                        del.setCity(etCity.getText().toString().trim());
                        del.setRegion(etRegion.getText().toString().trim());
                        del.setMobile(Integer.parseInt(etContact.getText().toString().trim()));

                        database.child(del.getfName()).setValue(del);

                        Toast.makeText(getApplicationContext(), "Data saved successfully", Toast.LENGTH_SHORT).show();
                        clearControls();

                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Number format Exception", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }

    private void openActivity2() {
        Intent intent = new Intent(this, ViewDelivery.class);
        startActivity(intent);
    }

    private void clearControls() {
        etFname.setText("");
        etSname.setText("");
        etAddl1.setText("");
        etAddl2.setText("");
        etRegion.setText("");
        etCity.setText("");
        etContact.setText("");
    }
}
