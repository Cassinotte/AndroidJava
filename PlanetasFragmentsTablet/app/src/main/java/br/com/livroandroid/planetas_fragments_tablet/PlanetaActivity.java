package br.com.livroandroid.planetas_fragments_tablet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class PlanetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planeta);

        // Mostra o nome do planeta como título na action bar
        String planeta = getIntent().getStringExtra("planeta");
        getSupportActionBar().setTitle(planeta);

        if(savedInstanceState == null) {
            PlanetaFragment f = new PlanetaFragment();
            f.setArguments(getIntent().getExtras()); // Parâmetros: bundle da intent
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.layoutFrag, f, "PlanetaFragment");
            ft.commit();
        }
    }
}