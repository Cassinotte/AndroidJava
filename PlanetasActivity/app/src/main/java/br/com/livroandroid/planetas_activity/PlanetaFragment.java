package br.com.livroandroid.planetas_activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PlanetaFragment extends Fragment {

    public PlanetaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_planeta, container, false);

        return view;

    }

    public void setPlaneta(String planeta)
    {
        TextView text = (TextView) getView().findViewById(R.id.text);
        text.setText("Planeta: " + planeta);
    }
}