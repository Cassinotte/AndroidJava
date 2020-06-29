package br.com.livroandroid.demo_views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class ExemploViewPagerActivity extends AppCompatActivity {

    // Planetas
    private int[] images = {
            R.drawable.planeta_01_mercurio, R.drawable.planeta_02_venus,
            R.drawable.planeta_03_terra, R.drawable.planeta_04_marte,
            R.drawable.planeta_05_jupiter,
            R.drawable.planeta_06_saturno,
            R.drawable.planeta_07_urano,
            R.drawable.planeta_08_neptuno,
            R.drawable.planeta_09_plutao
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_view_pager);

        ViewPager g = (ViewPager) findViewById(R.id.viewPager);
        g.setAdapter(new ImagemPagerAdapter(this,images));

        g.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast t = Toast.makeText(getBaseContext(), "Imagem: " + position, Toast.LENGTH_SHORT);

                t.show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}