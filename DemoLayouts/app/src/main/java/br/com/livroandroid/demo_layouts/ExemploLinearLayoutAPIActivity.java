package br.com.livroandroid.demo_layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExemploLinearLayoutAPIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Cria o layout
        // Cria o layout
        LinearLayout layout = new LinearLayout(this);
        layout.setPadding(10, 10, 10, 10);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
        layout.setPadding(10, 10, 10, 10);//pixels

        TextView nome = new TextView(this);
        nome.setText("Nome:");
        nome.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        layout.addView(nome);

        EditText tnome = new EditText(this);
        tnome.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        layout.addView(tnome);
        // Focus
        tnome.requestFocus();

        TextView senha = new TextView(this);
        senha.setText("Senha:");
        senha.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        layout.addView(senha);

        EditText tsenha = new EditText(this);
        tsenha.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        layout.addView(tsenha);

        // Botão alinhado a direita
        Button ok = new Button(this);
        ok.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
//		ok.setGravity(Gravity.RIGHT);
        ok.setText("OK");
        layout.addView(ok);

        // Informa o layout
        setContentView(layout);


    }
}
