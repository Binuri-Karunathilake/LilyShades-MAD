 package com.example.mad;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;

 import androidx.appcompat.app.AppCompatActivity;

public class ViewDelivery extends AppCompatActivity {
    Button edit;
    Button delete;
    Button newadd;
    Button btn_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_delivery);
        getSupportActionBar().hide();

        newadd = findViewById(R.id.btn_newAddress);
        newadd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openaddDelivery();
            }
        });

        edit = findViewById(R.id.btn_edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEdit();
            }
        });

        delete = findViewById(R.id.btn_delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openView();
            }
        });

        btn_continue = findViewById(R.id.btn_continue);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOrder();
            }
        });
    }
    private void openaddDelivery() {
        Intent intent = new Intent(this, AddDelivery.class);
        startActivity(intent);
    }

    private void openEdit() {
        Intent intent = new Intent(this, Update.class);
        startActivity(intent);
    }

    private void openOrder() {
        Intent intent = new Intent(this, Order.class);
        startActivity(intent);
    }
    private void openView() {
        Intent intent = new Intent(this,ViewDelivery.class);
        startActivity(intent);
    }

}


