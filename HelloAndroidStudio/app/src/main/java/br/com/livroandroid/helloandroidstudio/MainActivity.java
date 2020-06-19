package br.com.livroandroid.helloandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "livro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG,"log de verbose");
        Log.d(TAG, "log de degug");
        Log.i(TAG, "log de info");
        Log.w(TAG, "log de alerta");
        Log.e(TAG,"log de erro", new RuntimeException("teste de erro"));

        Button btLogin = (Button) findViewById(R.id.btLogin);

        /*btLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tsenha = (TextView) findViewById(R.id.tSenha);

                String login = tLogin.getText().toString();
                String senha = tsenha.getText().toString();

                if ("ricardo".equals(login) && "123".equals(senha)) {
                    alert("Bem vindo, login realizado com sucesso");
                }
                else
                {
                    alert("Login e senha incorretos");
                }



            }
        }); */

        btLogin.setOnClickListener(onClickLogin());



    }

    private View.OnClickListener onClickLogin() {

        return new Button.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tsenha = (TextView) findViewById(R.id.tSenha);

                String login = tLogin.getText().toString();
                String senha = tsenha.getText().toString();

                if ("ricardo".equals(login) && "123".equals(senha)) {
                    alert("Bem vindo, login realizado com sucesso");
                }
                else
                {
                    alert("Login e senha incorretos");
                }

            }
        };

    }

    private void alert(String s) {

        // a class Toast mostra um alert temporario muito comum no android
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}