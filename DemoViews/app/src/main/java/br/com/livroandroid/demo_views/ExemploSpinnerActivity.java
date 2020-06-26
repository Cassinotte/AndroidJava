package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class ExemploSpinnerActivity extends AppCompatActivity {

    // Planetas
    private int[] images = {
            R.drawable.planeta_01_mercurio, R.drawable.planeta_02_venus, R.drawable.planeta_03_terra,
            R.drawable.planeta_04_marte, R.drawable.planeta_05_jupiter, R.drawable.planeta_06_saturno,
            R.drawable.planeta_07_urano, R.drawable.planeta_08_neptuno, R.drawable.planeta_09_plutao };

    private String[] planetas = new String[] { "Mercúrio", "Vênus", "Terra", "Marte",
        "Júpiter", "Saturno", "Urano", "Neturno", "Plutão"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_spinner);

        final ImageView imagem = (ImageView) findViewById(R.id.img);
        final Spinner combo = (Spinner) findViewById(R.id.comboPlanetas);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, planetas);

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo.setAdapter(adaptador);

        //Se Selecionar algum planeta atualiza a imagem
        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Atualiza a imagem
                imagem.setImageResource(images[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { }


        });


    }
}