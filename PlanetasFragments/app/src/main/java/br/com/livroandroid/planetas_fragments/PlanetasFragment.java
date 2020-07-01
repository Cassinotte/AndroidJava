package br.com.livroandroid.planetas_fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlanetasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlanetasFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_planetas, container, false);
        // ListView
        ListView listView = (ListView) view.findViewById(R.id.listview);
        listView.setAdapter(new PlanetaAdapter(getActivity()));
        listView.setOnItemClickListener(onItemClickPlaneta());
        return view;
    }
    private AdapterView.OnItemClickListener onItemClickPlaneta() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PlanetaAdapter adapter = (PlanetaAdapter) parent.getAdapter();
                String planeta = (String) adapter.getItem(position);
                Toast.makeText(getActivity(), "Planeta: " + planeta, Toast.LENGTH_SHORT).show();

                // Faz a navegação de telas
                Intent intent = new Intent(getActivity(),PlanetaActivity.class);
                intent.putExtra("planeta",planeta);
                startActivity(intent);
            }
        };
    }
}