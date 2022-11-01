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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txt1=(EditText) findViewById(R.id.txt1);
        EditText txt2=(EditText) findViewById(R.id.txt2);
        Button btn=(Button) findViewById(R.id.btn);

        SharedPreferences sh=getSharedPreferences("Userinfo", Context.MODE_PRIVATE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=txt1.getText().toString();
                String b=txt2.getText().toString();
                if(a.length()==0 && b.length()==0){
                    Toast.makeText(MainActivity.this, "Please Enter Email and password", Toast.LENGTH_SHORT).show();
                }
                else {
                    SharedPreferences.Editor x = sh.edit();
                    SharedPreferences.Editor y = sh.edit();
                    x.putString("email", a);
                    y.putString("pass", b);
                    x.commit();
                    y.commit();
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(i);
                }
            }
        });


    }
}


