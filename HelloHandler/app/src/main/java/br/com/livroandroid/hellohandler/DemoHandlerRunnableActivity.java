package br.com.livroandroid.hellohandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DemoHandlerRunnableActivity extends AppCompatActivity {

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_handler_message);

        findViewById(R.id.btEnviar).setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Cria a mensagem com delay de três segundos
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getBaseContext(), "A mensagem chegou com Runnable!", Toast.LENGTH_SHORT).show();
                    }
                }, 3000);
            }
        });
    }
}