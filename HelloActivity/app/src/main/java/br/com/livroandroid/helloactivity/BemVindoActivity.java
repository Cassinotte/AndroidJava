package br.com.livroandroid.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BemVindoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo); //Layout desta activity

        // Recebe o nome enviado por parametro
        Bundle args = getIntent().getExtras();

        String nome = args.getString("nome");

        //Vamos atualizar o texto do TextView com uma mensagem de bem-vindo
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(nome + ", seja bem-vindo.");

        // Acidicona o botão "up navigation"
        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home) {
            // O método finish() vai encerrar essa activity
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infla o menu da action bar (/res/menu/main.xml)
        getMenuInflater().inflate(R.menu.menu_bem_vindo, menu);
        return true;
    }*/

}