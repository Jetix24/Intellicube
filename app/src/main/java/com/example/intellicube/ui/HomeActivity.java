package com.example.intellicube.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intellicube.MainActivity;
import com.example.intellicube.R;

public class HomeActivity extends AppCompatActivity {

    Button button_iniciarSesionHome, button_registrarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button_iniciarSesionHome = findViewById(R.id.button_iniciarSesionHome);
        button_registrarHome = findViewById(R.id.button_registrarHome);

        button_iniciarSesionHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IniciarSesionActivity.class);
                startActivity(intent);
            }
        });
        button_registrarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistroActivity.class);
                startActivity(intent);
            }
        });
    }
}