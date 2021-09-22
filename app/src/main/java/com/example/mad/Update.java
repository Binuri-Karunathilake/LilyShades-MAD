package com.example.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Update extends AppCompatActivity {
    Button update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
        getSupportActionBar().hide();

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



