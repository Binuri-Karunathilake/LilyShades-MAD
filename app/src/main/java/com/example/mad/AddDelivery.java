package com.example.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AddDelivery extends AppCompatActivity {
    Button btn_addDelivery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_delivery);
        getSupportActionBar().hide();

        btn_addDelivery = findViewById(R.id.btn1_addAddress);
        //click button to add data
        btn_addDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity2();
            }
        });
    }
    private void openActivity2() {
        Intent intent = new Intent(this,ViewDelivery.class);
        startActivity(intent);
    }
}

