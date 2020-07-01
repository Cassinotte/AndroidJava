package br.com.livroandroid.demofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class DemoFragment4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_demo_fragment4);

        if (savedInstanceState == null) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction t = fm.beginTransaction();

            // Fragment
            Fragment4 f = new Fragment4();

            // Args
            Intent intent = getIntent();
            Bundle args = intent.getExtras();
            f.setArguments(args);

            // Transaction
            t.add(R.id.layoutFrag, f, "Fragment4");
            t.commit();
        }
    }
}