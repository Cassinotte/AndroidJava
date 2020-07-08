package br.com.livroandroid.helloasynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private static final String URL = "https://images-na.ssl-images-amazon.com/images/I/414PH3kuCZL._SX357_BO1,204,203,200_.jpg";
    private ProgressBar progressBar;
    private ImageView imgView;

    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.img);

    }
}