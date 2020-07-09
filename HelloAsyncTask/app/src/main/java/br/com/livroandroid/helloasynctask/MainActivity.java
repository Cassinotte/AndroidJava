package br.com.livroandroid.helloasynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private static final String URL = "https://images-na.ssl-images-amazon.com/images/I/414PH3kuCZL._SX357_BO1,204,203,200_.jpg";
    private ProgressBar progress;
    private ImageView imgView;

    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.img);
        progress = (ProgressBar) findViewById(R.id.progress);

        // Faz o download
        downloadImagem();

    }

    private void downloadImagem() {

        // Criar um AsyncTask
        DownloadTask task = new DownloadTask();

        // Executa a task/thread
        task.execute();
    }

    public Context getContext() { return this; }

    private class DownloadTask extends AsyncTask<Void, Void, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            // Executa antes do download. Mostra o ProgressBar para fazer a animação.
            progress.setVisibility(View.VISIBLE);
        }

        @Override
        protected Bitmap doInBackground(Void... voids) {
            // Faz o download em uma thread e retorna o bitmapp
            try {
                bitmap = Download.downloadBitmap(URL);
            }
            catch (Exception e)
            {
                Log.e("livroandroid", e.getMessage(), e);
            }

            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            if (bitmap != null)
            {
                // Atualiza a imagem na UI Thread
                imgView.setImageBitmap(bitmap);

                //Esconde o progress
                progress.setVisibility(View.INVISIBLE);
            }
        }
    }


}