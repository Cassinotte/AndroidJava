package br.com.livroandroid.helloactivitytransition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlanetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planeta);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void finish()
    {
        super.finish();

        //Customizacao a animação ao fechar a activity
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}