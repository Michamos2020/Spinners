package com.example.spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    Button ejecutar;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner_opciones);
        String[] seleccionar = {"Mascotas", "Pokemon", "Animales"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, seleccionar);
        spinner.setAdapter(adapter);
    }
        public void Ejecutar(View view){
            String Seleccion = spinner.getSelectedItem().toString();
        if (Seleccion.equals("Mascotas")){
            Intent pantallaMascotas = new Intent(this, Mascotas.class);
            startActivity(pantallaMascotas);
        } else if (Seleccion.equals("Pokemon")) {
            Intent pantallaPokemon = new Intent(this, Pokemon.class);
            startActivity(pantallaPokemon);
        } else if (Seleccion.equals("Animales")) {
            Intent pantallaAnimal = new Intent(this, Animal.class);
            startActivity(pantallaAnimal);
        }
    }
}
