package com.example.motelya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    Button buttoniniciar;
    Button buttonregistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonregistrar = findViewById(R.id.btnRegistro);
        buttonregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrar = new Intent(MainActivity.this,activityRegistro.class);
                startActivity(registrar);
            }
        });
        buttoniniciar = findViewById(R.id.btInicio);
        buttoniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iniciar = new Intent(MainActivity.this,activityInicio.class);
                startActivity(iniciar);
            }
        });
    }
    @Override
    public void onStart() {
        super.onStart();

    }




}
