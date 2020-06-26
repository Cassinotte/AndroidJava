package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ExemploProgressDialogActivity extends AppCompatActivity {

    private static final String URL = "https://images-na.ssl-images-amazon.com/images/I/414PH3kuCZL._SX357_BO1,204,203,200_.jpg";
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_progress_dialog);

        dialog = ProgressDialog.show(this,"Exemplo",
                "Buscando imagem, por favor, aguarde....", false, true);

        downloadImage(URL);


    }

    private void downloadImage(final String urlImg) {

        new Thread() {
            @Override
            public void run() {

                try {


                //Faz o download da imagem
                URL url = new URL(urlImg);
                InputStream in = url.openStream();

                //Convert a InputStream do Java para Bitmap
                final Bitmap imagem = BitmapFactory.decodeStream(in);
                in.close();

                // Atualiza a tela
                atualizaImagem(imagem);
                }
                catch (IOException e)
                {
                    // Uma aplicacao real deveria tratar este erro
                    Log.e("Erro ao fazer o download: ", e.getMessage(), e);
                }

            }
        }.start();
    }

    private void atualizaImagem(final Bitmap imagem) {
        runOnUiThread(new Runnable() { // Este código é necessario, pois foi aberta uma thread
            @Override
            public void run() {

                //Fecha a janela de progresso
                dialog.dismiss();
                ImageView imgView = (ImageView) findViewById(R.id.img);
                imgView.setImageBitmap(imagem);

            }
        });

    }
}