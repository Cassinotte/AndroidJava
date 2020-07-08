package br.com.livroandroid.hellohandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

public class ContadorActivity extends AppCompatActivity implements Runnable {

    private static final String CATEGORIA = "livro";
    private int count;
    private TextView text;
    private Handler handler;
    private boolean running;
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_thread_sleep);
        text = (TextView) findViewById(R.id.text);
        running = true;
        handler = new Handler();
        handler.post(this);

    }
    @Override
    public void run() {
        if (running) {
            count++;
            Log.i(CATEGORIA, "Handler.run() count: " + count);
            text.setText("Contador: " + count);
            // Repetir depois de 1 segundo
            handler.postDelayed(this, 1000);
        } else {
            Log.i(CATEGORIA, "Handler fim.");
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Encerrar as mensagens do handler
        Log.i(CATEGORIA,"onDestroy()");
        running = false;
    }
}