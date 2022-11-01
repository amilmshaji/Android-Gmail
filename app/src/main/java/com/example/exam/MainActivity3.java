package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btn=(Button) findViewById(R.id.btn);
        EditText txt=(EditText) findViewById(R.id.txt1);

        SharedPreferences sh=getSharedPreferences("Userinfo", Context.MODE_PRIVATE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=txt.getText().toString();
                SharedPreferences.Editor y = sh.edit();
                y.putString("pass", a);
                y.commit();

                Toast.makeText(MainActivity3.this, "Password Changed", Toast.LENGTH_SHORT).show();
            }
        });


    }
}