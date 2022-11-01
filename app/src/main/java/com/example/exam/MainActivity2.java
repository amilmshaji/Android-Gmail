package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt1=(TextView) findViewById(R.id.txt1);
        TextView txt2=(TextView) findViewById(R.id.txt2) ;
        Button btn=(Button) findViewById(R.id.btn5);

        SharedPreferences sh=getSharedPreferences("Userinfo", Context.MODE_PRIVATE);
        String email=sh.getString("email","");
        String pass=sh.getString("pass","");

        txt1.setText(email);
        txt2.setText(pass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(j);
            }
        });
    }
}


