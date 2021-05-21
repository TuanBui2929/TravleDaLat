package com.example.travletravle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Dangnhap extends AppCompatActivity {
    EditText email;
    TextView noaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        email = (EditText) findViewById(R.id.editemaildangnhap);
        noaccount =(TextView) findViewById(R.id.txtchuacotaikhoan);
        noaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dangnhap.this,Dangki.class);
                startActivity(intent);
            }
        });
    }
}