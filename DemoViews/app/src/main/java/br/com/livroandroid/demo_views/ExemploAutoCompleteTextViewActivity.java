package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ExemploAutoCompleteTextViewActivity extends AppCompatActivity {

    private static final String[] ESTADOS = new String[] { "Acre", "Alagoas", "Amapá", "Amazonas",
    "Bahia", "Ceará", "...", "São Paulo","Santa Catarina", "Sergipe", "Tocantins" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_auto_complete_text_view);

        AutoCompleteTextView estados = (AutoCompleteTextView) findViewById(R.id.estados);

        // Adpater para preencher com os estados
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, ESTADOS);

        estados.setAdapter(adaptador);

    }
}