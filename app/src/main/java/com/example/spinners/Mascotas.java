package com.example.spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Mascotas extends AppCompatActivity {
    TextView textoMascotas;

    ListView listadatos;
    private String nombre[] = {"Srita Nicole", "Joven Cesar", "Joven Jared", "Joven Jorge", "Srita Liliana",
            "Señorita Joseline", "Joven Eduardo", "Joven Irving", "Srita Fernanda", "Srita Iris", "Sra.Zaira", "Srita Hanzel",
            "Srita. Carmen", "Srita Perla"};
    private String mascotas[] = {"tortuga", "Pez", "Mich & Lomito", "Lomito", "Michi", "Michi,Lomito,Pollo,Tortuga,Conejito",
            "Lomito", "Lomito", "Michi & Lomitos", "Lomito", "lomito", "lomito", "Loro", "La granja completa"};

 @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_mascotas);
     textoMascotas = (TextView) findViewById(R.id.textView);
     listadatos = (ListView) findViewById(R.id.ListView);


     ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_view_mascotas,nombre);
    // ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, R.layout.list_view_mascotas,mascotas);

     listadatos.setAdapter(adapter);

        listadatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
textoMascotas.setText(listadatos.getItemAtPosition(i)+"tiene "+mascotas[i]+"felices" );
            }
        });
    }
}
