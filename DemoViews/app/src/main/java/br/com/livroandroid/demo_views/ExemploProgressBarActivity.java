package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ExemploProgressBarActivity extends AppCompatActivity {

    private static final String TAG = "livro";
    private ProgressBar mProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_progress_bar);

        //Barra de progresso
        mProgress = (ProgressBar) findViewById(R.id.barraProgresso);
        Button b = (Button) findViewById(R.id.btnOK);

        b.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        for(int i=0; i <= 100; i++) {

                            final int progress = i;

                            //Atualiza a barra de progresso
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Log.d(TAG,">> Progress: " + progress);
                                    mProgress.setProgress(progress);
                                }
                            });

                            try {
                                Thread.sleep(200);
                            }
                            catch (InterruptedException e) {}

                        }

                        Log.d(TAG,"Fim.");
                    }
                }).start();
            }
        });

    }
}