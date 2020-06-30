package br.com.livroandroid.hellofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // O FragmentManager é necessario para brincar com os fragments
        // Se necessário recuperar o FragmentManager para encontrar algum fragment
        FragmentManager fm = getSupportFragmentManager();

        // Se estiver adicionado no XML
        Fragment1 frag1 = (Fragment1) fm.findFragmentById(R.id.frag1);
        frag1.hello();

        // Adiciona o fragment dinamicamente pela API
        //if (savedInstanceState == null) {
        //    FragmentTransaction ft = fm.beginTransaction();
        //    Fragment1 frag1 = new Fragment1();
        //    ft.add(R.id.layoutFrag, frag1, "Fragment1");
        //    ft.commit();
        //}

    }
}