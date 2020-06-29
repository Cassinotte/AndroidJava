package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.List;

public class ExemploViewPagerTitleStripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_view_pager_title_strip);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Planetas
        List<Planeta> planetas = Planeta.getPlanetas();

        //ViewPager
        ViewPager g = (ViewPager) findViewById(R.id.viewPager);
        g.setAdapter(new PlanetasPagerAdapter(this, planetas));
    }
}