package br.com.livroandroid.hellohandler;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Download {

    public static Bitmap downloadBitmap(String url) throws IOException
    {
        // Faz o download da imagem
        Bitmap bitmap = null;
        InputStream in = new URL(url).openStream();

        // Convert a InputStream do Java para Bitmap
        bitmap = BitmapFactory.decodeStream(in);

        in.close();

        return bitmap;

    }

}
