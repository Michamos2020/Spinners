package com.example.spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Pokemon extends AppCompatActivity {
    private MediaPlayer sound, sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10,sound11,
            sound12,sound13,sound14,sound15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);
        sound = MediaPlayer.create(this, R.raw.charizard);
        sound2= MediaPlayer.create(this, R.raw.chikorita);
        sound3= MediaPlayer.create(this, R.raw.bulbasaur);
        sound4= MediaPlayer.create(this, R.raw.psyduck);
        sound5= MediaPlayer.create(this, R.raw.torchic);
        sound6= MediaPlayer.create(this, R.raw.rowlet);
        sound7= MediaPlayer.create(this, R.raw.caterpie);
        sound8= MediaPlayer.create(this, R.raw.evee);
        sound9= MediaPlayer.create(this, R.raw.elekid);
        sound10= MediaPlayer.create(this, R.raw.jiggly_puf);
        sound11= MediaPlayer.create(this, R.raw.meuwth);
        sound12= MediaPlayer.create(this, R.raw.pidgey);
        sound13= MediaPlayer.create(this, R.raw.piplup);
        sound14= MediaPlayer.create(this, R.raw.sandshrew);
        sound15= MediaPlayer.create(this, R.raw.umbreon);



    }
    public void MensajeCharizard(View view){
        Toast.makeText(this, "soy un charizard bebè", Toast.LENGTH_SHORT).show();
        sound.start();

    }
    public void MensajeChikorita(View view){
        Toast.makeText(this, "soy una chikoritaaa bebè", Toast.LENGTH_SHORT).show();
        sound2.start();

    }
    public void MensajeBulbasaur(View view){
        Toast.makeText(this, "soy una bulbasaur bebè", Toast.LENGTH_SHORT).show();
        sound3.start();

    }
    public void MensajePsyduck(View view){
        Toast.makeText(this, "soy una psyduck bebè", Toast.LENGTH_SHORT).show();
        sound4.start();

    }
    public void Mensajetorchic(View view){
        Toast.makeText(this, "soy una torchic bebè", Toast.LENGTH_SHORT).show();
        sound5.start();

    }
    public void Mensajerowlet(View view){
        Toast.makeText(this, "soy una rowlet bebè", Toast.LENGTH_SHORT).show();
        sound6.start();

    }
    public void Mensajecaterpie(View view){
        Toast.makeText(this, "soy una caterpie bebè", Toast.LENGTH_SHORT).show();
        sound7.start();

    }
    public void Mensajeevee(View view){
        Toast.makeText(this, "soy una eevee bebè", Toast.LENGTH_SHORT).show();
        sound8.start();

    }
    public void Mensajeelekid(View view){
        Toast.makeText(this, "soy una elekid bebè", Toast.LENGTH_SHORT).show();
        sound9.start();

    }
    public void Mensajejiggly_puf(View view){
        Toast.makeText(this, "soy una jiggly_puff bebè", Toast.LENGTH_SHORT).show();
        sound10.start();

    }
    public void Mensajemeuwth(View view){
        Toast.makeText(this, "soy una meuwth bebè", Toast.LENGTH_SHORT).show();
        sound11.start();

    }
    public void MensajePidgey(View view){
        Toast.makeText(this, "soy una pidgey bebè", Toast.LENGTH_SHORT).show();
        sound12.start();

    }
    public void Mensajepiplup(View view){
        Toast.makeText(this, "soy una piplup bebè", Toast.LENGTH_SHORT).show();
        sound13.start();

    }
    public void Mensajesandshrew(View view){
        Toast.makeText(this, "soy una sandshrew bebè", Toast.LENGTH_SHORT).show();
        sound14.start();

    }
    public void Mensajeumbreon(View view){
        Toast.makeText(this, "soy una umbreon bebè", Toast.LENGTH_SHORT).show();
        sound15.start();

    }
    public void Regresa(View view) {
    Intent pantallaPrincipal = new Intent(this, MainActivity.class);
    startActivity(pantallaPrincipal);
}
}
