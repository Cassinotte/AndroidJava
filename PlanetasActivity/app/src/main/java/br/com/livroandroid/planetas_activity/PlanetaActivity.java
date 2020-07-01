package br.com.livroandroid.planetas_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlanetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planeta);

        //Parâmetro enviado pela intent da activity
        String planeta = getIntent().getStringExtra("planeta");

        // Pega p fragment do layout pelo id
        PlanetaFragment f = (PlanetaFragment)
                getSupportFragmentManager().findFragmentById(R.id.PlanetaFragment);

        // Atualiza o conteudo
        f.setPlaneta(planeta);

        // Configura o nome do planeta como titulo na action bar
        getSupportActionBar().setTitle(planeta);
    }
}