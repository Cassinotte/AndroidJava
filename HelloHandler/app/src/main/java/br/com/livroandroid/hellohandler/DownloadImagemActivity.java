package br.com.livroandroid.hellohandler;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.IOException;

public class DownloadImagemActivity extends AppCompatActivity {

    private static final String URL = "https://images-na.ssl-images-amazon.com/images/I/414PH3kuCZL._SX357_BO1,204,203,200_.jpg";
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_imagem);

        progress = (ProgressBar) findViewById(R.id.progress);
        progress.setVisibility(View.VISIBLE);
        downloadImage(URL);

    }

    private void downloadImage(final String urlImg) {
        new Thread() {

            @Override
            public void run() {
                try {
                    // Faz o download da imagem
                    final Bitmap image = Download.downloadBitmap(urlImg);

                    //Atualiza a tela
                    atualizaImagem(image);
                }
                catch (IOException e)
                {
                    // Uma aplicação real deveria tratar este erro
                    Log.e("Erro ao fazer o download: ", e.getMessage(), e);
                }
            }
        }.start();
    }

    private void atualizaImagem(final Bitmap imagem)
    {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //Esconde o progress
                progress.setVisibility(View.INVISIBLE);

                // Atualiza a imagem
                ImageView imgView = (ImageView) findViewById(R.id.img);
                imgView.setImageBitmap(imagem);
            }
        });

    }
}