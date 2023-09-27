package com.example.intellicube.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.intellicube.MainActivity;
import com.example.intellicube.R;
import com.google.android.material.textfield.TextInputEditText;

public class IniciarSesionActivity extends AppCompatActivity {

    Button button_iniciarSesionInicio, button_registrarInicio;
    LinearLayout button_borrarInicio;
    ImageButton button_regresarInicio;

    TextInputEditText TextInputEditText_correoInicio, TextInputEditText_passInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
        button_iniciarSesionInicio = findViewById(R.id.button_iniciarSesionInicio);
        button_registrarInicio = findViewById(R.id.button_registrarInicio);
        button_borrarInicio = findViewById(R.id.button_borrarInicio);
        button_regresarInicio = findViewById(R.id.imageButton_regresarInicio);

        TextInputEditText_correoInicio = findViewById(R.id.TextInputEditText_correoInicio);
        TextInputEditText_passInicio = findViewById(R.id.TextInputEditText_passInicio);

        button_iniciarSesionInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        button_borrarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText_correoInicio.setText("");
                TextInputEditText_passInicio.setText("");
            }
        });

        button_registrarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistroActivity.class);
                startActivity(intent);
            }
        });

        button_regresarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}