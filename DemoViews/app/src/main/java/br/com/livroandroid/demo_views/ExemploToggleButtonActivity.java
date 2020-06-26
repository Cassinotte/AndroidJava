package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ExemploToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_toggle_button);

        final ToggleButton toggle = (ToggleButton) findViewById(R.id.toggle);
        Button b = (Button) findViewById(R.id.btnOK);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean selecionado = toggle.isChecked();
                Toast.makeText(ExemploToggleButtonActivity.this, "Selecionado: " + selecionado,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}