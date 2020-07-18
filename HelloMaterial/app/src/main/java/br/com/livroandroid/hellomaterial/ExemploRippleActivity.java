package br.com.livroandroid.hellomaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ExemploRippleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_ripple);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}