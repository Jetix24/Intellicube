package com.example.intellicube.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.intellicube.R;
import com.google.android.material.textfield.TextInputEditText;

public class RegistroActivity extends AppCompatActivity {

    Button button_registrar;
    LinearLayout button_borrarRegistro;
    ImageButton button_regresarRegistro;

    TextInputEditText TextInputEditText_nombreRegistro, TextInputEditText_apellidosRegistro, TextInputEditText_estadoRegistro,
            TextInputEditText_municipioRegistro, TextInputEditText_correoRegistro, TextInputEditText_passRegistro,
            TextInputEditText_passDosRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        button_registrar = findViewById(R.id.button_registrar);
        button_borrarRegistro = findViewById(R.id.button_borrarRegistro);
        button_regresarRegistro = findViewById(R.id.imageButton_regresarRegistro);
        TextInputEditText_nombreRegistro = findViewById(R.id.TextInputEditText_nombreRegistro);
        TextInputEditText_apellidosRegistro = findViewById(R.id.TextInputEditText_apellidosRegistro);
        TextInputEditText_estadoRegistro = findViewById(R.id.TextInputEditText_estadoRegistro);
        TextInputEditText_municipioRegistro = findViewById(R.id.TextInputEditText_municipioRegistro);
        TextInputEditText_correoRegistro = findViewById(R.id.TextInputEditText_correoRegistro);
        TextInputEditText_passRegistro = findViewById(R.id.TextInputEditText_passRegistro);
        TextInputEditText_passDosRegistro = findViewById(R.id.TextInputEditText_passDosRegistro);

        button_regresarRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        button_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(getApplicationContext(), IniciarSesionActivity.class);
                startActivity(intent);
            }
        });



        button_borrarRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText_nombreRegistro.setText("");
                TextInputEditText_apellidosRegistro.setText("");
                TextInputEditText_estadoRegistro.setText("");
                TextInputEditText_municipioRegistro.setText("");
                TextInputEditText_correoRegistro.setText("");
                TextInputEditText_passRegistro.setText("");
                TextInputEditText_passDosRegistro.setText("");
            }
        });
    }
}