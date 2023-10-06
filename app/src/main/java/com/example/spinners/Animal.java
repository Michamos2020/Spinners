package com.example.spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Animal extends AppCompatActivity {
    private EditText txtingresaDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        txtingresaDato= (EditText) findViewById(R.id.txtingresaDato);


    }
    public void Enviar (View view) {
        Intent pantallaResultado = new Intent(this, PantallaEnviar1.class);
        pantallaResultado.putExtra("enviarDato", txtingresaDato.getText().toString().toLowerCase());
        if (pantallaResultado.equals(""))
            Toast.makeText(Animal.this, "Ingresa algo por favor", Toast.LENGTH_SHORT).show();
        else
            startActivity(pantallaResultado);


    }
}