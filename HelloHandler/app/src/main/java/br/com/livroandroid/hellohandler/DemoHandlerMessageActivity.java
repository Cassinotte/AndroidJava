package br.com.livroandroid.hellohandler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DemoHandlerMessageActivity extends AppCompatActivity {

    protected static final int MENSAGEM_TESTE = 1;

    private Handler handler = new TestHandler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_handler_message);


        findViewById(R.id.btEnviar).setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {

                // Cria a mensagem com delay de três segundos
                Message msg = new Message();
                msg.what = MENSAGEM_TESTE;

                //Envia a mensagem
                handler.sendMessageDelayed(msg, 3000);


            }
        });
    }

    private class TestHandler extends Handler {

        @Override
        public void handleMessage(@NonNull Message msg) {
            // o atributo msg.what permite identificar a mensagem
            switch (msg.what) {

                case MENSAGEM_TESTE:
                    Toast.makeText(getBaseContext(), "A mensagem chegou!", Toast.LENGTH_SHORT).show();
            }


            //super.handleMessage(msg);


        }
    }
}