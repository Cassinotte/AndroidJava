package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ExemploListViewPlanetasActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final String TAG = "livro";
    private ListView listView;

    private List<Planeta> planetas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_list_view_planetas);

        //ListView
        listView = (ListView) findViewById(R.id.listview);
        planetas = Planeta.getPlanetas();

        //listView.setAdapter(new SimplesAdapter(this));
        listView.setAdapter(new PlanetaAdapter(this, planetas));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int idx, long id) {
        Planeta p = (Planeta) parent.getAdapter().getItem(idx);
        Toast.makeText(this, "Planeta: " + p.nome, Toast.LENGTH_SHORT).show();
    }
}