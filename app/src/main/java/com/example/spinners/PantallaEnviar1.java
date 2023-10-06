package com.example.spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PantallaEnviar1 extends AppCompatActivity {
    private TextView txtRespuestaDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_enviar1);
        txtRespuestaDato = (TextView) findViewById(R.id.txtRespuestaDato);
        String DatoRecibido = getIntent().getStringExtra("enviarDato");
        txtRespuestaDato.setText("Su resultado es: " + DatoRecibido);
    }

    //metodo para regresar
    public void Regresar(View view) {
        Intent pantallaPrincipal = new Intent(this, MainActivity.class);
        startActivity(pantallaPrincipal);
    }
}