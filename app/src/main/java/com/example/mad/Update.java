package com.example.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Update extends AppCompatActivity {
    Button update;
//    EditText etFname, etSname, etAddl1, etAddl2, etCity, etRegion, etContact;
//    String username;
//    //Firestore instance
//    DatabaseReference database, updref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
        getSupportActionBar().hide();


//        Intent intent = getIntent();
//        username = intent.getStringExtra("fname");
//
//        etFname = findViewById(R.id.et1_fName);
//        etSname = findViewById(R.id.et1_sName);
//        etAddl1 = findViewById(R.id.et1_address1);
//        etAddl2 = findViewById(R.id.et1_address2);
//        etCity = findViewById(R.id.et1_city);
//        etRegion = findViewById(R.id.et1_regionState);
//        etContact = findViewById(R.id.et1_contact);

        update = findViewById(R.id.btn1_Update);

        //update method
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openView();
            }

        });
    }


    private void openView() {
        Intent intent = new Intent(this, ViewDelivery.class);
        startActivity(intent);
    }
}

