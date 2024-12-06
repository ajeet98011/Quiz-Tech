package com.example.quiztech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        View Python = findViewById(R.id.python);
        View Java = findViewById(R.id.java);
        View Cpp = findViewById(R.id.cpp);
        View Js = findViewById(R.id.js);
        View Kotlin = findViewById(R.id.kotlin);

        Python.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent= new Intent (Home.this,Python.class);
                startActivity(intent);
            }
        });
        Java.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent= new Intent (Home.this,Java.class);
                startActivity(intent);
            }
        });
        Cpp.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent= new Intent (Home.this,Cpp.class);
                startActivity(intent);
            }
        });
        Js.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent= new Intent (Home.this,JS.class);
                startActivity(intent);
            }
        });
        Kotlin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent= new Intent (Home.this,Kotlin.class);
                startActivity(intent);
            }
        });
    }
}