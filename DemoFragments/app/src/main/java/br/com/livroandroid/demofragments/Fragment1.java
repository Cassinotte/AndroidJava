package br.com.livroandroid.demofragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Fragment1 extends Fragment {

    private int count;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);

        // Recupera o estado da variavel
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
        }

        view.findViewById(R.id.btOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                Toast.makeText(getActivity(), "Count: " + count, Toast.LENGTH_LONG).show();
            }
        });

        return view;

    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);

        outState.putInt("count", count); // Salva o estado
    }

    public void hello() {
        Toast.makeText(getActivity(), "Hello Frag 1", Toast.LENGTH_SHORT).show();
    }
}