package com.example.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ViewDelivery extends AppCompatActivity {
    Button edit;
    Button delete;
    Button newadd;
    Button btn_continue;
    //RecyclerView recyclerView;
/*    EditText fName,sName;
    String id;
    Delivery del;*/
    TextView tvfname,tvsname,tvaddline1,tvaddline2,tvcity,tvregion,tvmobile;
    DatabaseReference database;
    FirebaseDatabase firebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_delivery);
        getSupportActionBar().hide();

        //initialize views with xml
        tvfname = findViewById(R.id.tv2fname);
        tvsname = findViewById(R.id.tv2sname);
        tvaddline1 = findViewById(R.id.tv2addline1);
        tvaddline2 = findViewById(R.id.tv2addline2);
        tvcity = findViewById(R.id.tv2city);
        tvregion = findViewById(R.id.tv2region);
        tvmobile = findViewById(R.id.tv2mobile);

        database = firebaseDatabase.getInstance().getReference().child("Delivery");

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                //successfully
                String fname = datasnapshot.child("fName").getValue(String.class);
                String sname = datasnapshot.child("sName").getValue(String.class);
                String addline1 = datasnapshot.child("addLine1").getValue(String.class);
                String addline2 = datasnapshot.child("addLine2").getValue(String.class);
                String city = datasnapshot.child("city").getValue(String.class);
                String region = datasnapshot.child("region").getValue(String.class);
                String mobile = datasnapshot.child("mobile").getValue(String.class);

                //set in text view
                tvfname.setText(fname);
                tvsname.setText(sname);
                tvaddline1.setText(addline1);
                tvaddline2.setText(addline2);
                tvcity.setText(city);
                tvregion.setText(region);
                tvmobile.setText(mobile);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //when error occured
            }
        });

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



