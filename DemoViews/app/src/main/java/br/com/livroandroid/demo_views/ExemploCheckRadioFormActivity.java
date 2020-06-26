package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ExemploCheckRadioFormActivity extends AppCompatActivity {

    private static final String TAG = "livro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_check_radio_form);

        final EditText textNome = (EditText) findViewById(R.id.textNome);
        final RadioGroup group = (RadioGroup) findViewById(R.id.group1);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean sim = R.id.radioSim == i;
                boolean nao = R.id.radioNao == i;

                if(sim){
                    Log.i(TAG, "Marcou radio Sim: " + i);
                }
                else
                {
                    Log.i(TAG, "Marcou radio Não: " + i );
                }
            }
        });

        final CheckBox check = (CheckBox) findViewById(R.id.checkReceberEmail);

        //Define um listener para executar quando alterar o check
        check.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.i(TAG, "check: " + b);
            }

        });

        Button b = (Button) findViewById(R.id.buttonEnviar);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i(TAG, "OK");

                //Compara o id do radioSim
                boolean concorda = R.id.radioSim == group.getCheckedRadioButtonId();
                boolean recebeEmail = check.isChecked();
                StringBuffer sb = new StringBuffer();

                sb.append("Nome: ").append(textNome.getText())
                        .append("\nReceber Email: ").append(recebeEmail ? "Sim" : "Não")
                        .append("\nConcorda: ").append(concorda ? "Sim" : "Não");

                Toast.makeText(ExemploCheckRadioFormActivity.this, sb.toString(), Toast.LENGTH_SHORT ).show();

            }
        });
    }
}