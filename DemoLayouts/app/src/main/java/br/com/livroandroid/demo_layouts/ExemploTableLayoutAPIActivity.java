package br.com.livroandroid.demo_layouts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;

public class ExemploTableLayoutAPIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cria o layout
        TableLayout tabela = new TableLayout(this);
        tabela.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        // Expande a coluna 1
        tabela.setColumnStretchable(1, true);

        // Linha 1
        TableRow linha1 = new TableRow(this);
        TextView nome = new TextView(this);

        nome.setText("Nome: ");
        linha1.addView(nome);

        EditText tnome = new EditText(this);

        //Focus no campo nome
        tnome.requestFocus();
        linha1.addView(tnome);

        // Linha 2
        TableRow linha2 = new TableRow(this);
        TextView senha = new TextView(this);
        senha.setText("Senha: ");
        linha2.addView(senha);

        EditText tsenha = new EditText(this);
        tsenha.setTransformationMethod(new PasswordTransformationMethod());
        linha2.addView(tsenha);

        // Linha 3
        TableRow linha3 = new TableRow(this);
        linha3.setGravity(Gravity.RIGHT);

        //Botao alinhado á direta
        Button ok = new Button(this);
        ok.setText(R.string.login);
        linha3.addView(ok);

        // Adiciona as linhas
        tabela.addView(linha1);
        tabela.addView(linha2);
        tabela.addView(linha3);

        //Informa o Layout
        setContentView(tabela);

    }
}
