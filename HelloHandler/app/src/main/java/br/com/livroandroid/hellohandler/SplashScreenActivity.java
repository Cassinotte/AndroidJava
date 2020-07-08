package br.com.livroandroid.hellohandler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Exibe o layout com a imagem...
        setContentView(R.layout.activity_splash_screen);

        // delay de 1 segundo
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Inicia a MainActivity
                startActivity(new Intent(getBaseContext(), MainActivity.class));

                //fecha a activity da slash
                finish();


            }
        }, 1000 ); // Um segundo de atraso

    }
}