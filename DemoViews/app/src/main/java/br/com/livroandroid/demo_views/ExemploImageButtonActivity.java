package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class ExemploImageButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_image_button);

        ImageButton botaoImage1 = (ImageButton) findViewById(R.id.img1);
        final Context context = this;

        botaoImage1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Imagem 1 OK", Toast.LENGTH_SHORT).show();
            }

        });

        ImageButton botaoImage2 = (ImageButton) findViewById(R.id.img2);
        botaoImage2.setImageResource(R.drawable.smile2);

        botaoImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Image 2 OK", Toast.LENGTH_SHORT).show();
            }
        });

    }
}