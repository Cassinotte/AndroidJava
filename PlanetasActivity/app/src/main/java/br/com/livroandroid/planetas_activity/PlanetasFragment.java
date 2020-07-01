package br.com.livroandroid.planetas_activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class PlanetasFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_planetas, container, false);

        //ListView
        ListView listView = (ListView) view.findViewById(R.id.listview);
        listView.setAdapter(new PlanetaAdapter(getActivity()));
        listView.setOnItemClickListener(onItemClickPlaneta());

        return view;

    }

    private AdapterView.OnItemClickListener onItemClickPlaneta()
    {
        return new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                PlanetaAdapter adapter = (PlanetaAdapter) adapterView.getAdapter();
                String planeta = (String) adapter.getItem(i);

                Toast.makeText(getActivity(), "Planeta: " + planeta, Toast.LENGTH_SHORT).show();

                // O Context e a activity, então pode utilizar o metodo getActivity
                // A navegacao de telas continua sendo feita pela activity
                Intent intent = new Intent(getActivity(), PlanetaActivity.class);
                intent.putExtra("planeta", planeta);

                startActivity(intent);

            }
        };
    }
}