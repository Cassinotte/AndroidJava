package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ExemploListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final String TAG = "livro";
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_list_view);

        //ListView
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new SimplesAdapter(this));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int idx, long id) {

        String s = (String) parent.getAdapter().getItem(idx); // Objeto selecionado, que neste caso era de um array de strings
        Toast.makeText(this, "Texto selecionado: " + s + ", posição: " + idx, Toast.LENGTH_SHORT).show();

    }
}