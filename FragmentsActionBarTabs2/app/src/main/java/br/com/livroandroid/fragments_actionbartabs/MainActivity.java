package br.com.livroandroid.fragments_actionbartabs;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Tab 1
        ActionBar.Tab tab1 = actionBar.newTab().setText("Frag 1");
        tab1.setTabListener(new MyTabListener(this, new Fragment1()));
        actionBar.addTab(tab1);
        // Tab 2
        ActionBar.Tab tab2 = actionBar.newTab().setText("Frag 2");
        tab2.setTabListener(new MyTabListener(this, new Fragment2()));
        actionBar.addTab(tab2);
        // Tab 3
        ActionBar.Tab tab3 = actionBar.newTab().setText("Frag 3");
        tab3.setTabListener(new MyTabListener(this, new Fragment3()));
        actionBar.addTab(tab3);
    }
}