package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class ExemploGridViewActivity extends AppCompatActivity {

    // Array com ids das imagens
    private int[] imagens = {
            R.drawable.smile1, R.drawable.smile2,
            R.drawable.smile1, R.drawable.smile2,
            R.drawable.smile1, R.drawable.smile2,
            R.drawable.smile1, R.drawable.smile2,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_grid_view);

        GridView gridView = (GridView) findViewById(R.id.grid1);
        gridView.setOnItemClickListener(onGridViewItemClick());

        // Informa o adapter para preencher o GridView
        gridView.setAdapter(new ImagemAdapter(this, imagens));

    }

    private OnItemClickListener onGridViewItemClick() {
        return new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ExemploGridViewActivity.this, "Imagem Selecionada: " +
                        i, Toast.LENGTH_SHORT).show();
            }
        };
    }
}