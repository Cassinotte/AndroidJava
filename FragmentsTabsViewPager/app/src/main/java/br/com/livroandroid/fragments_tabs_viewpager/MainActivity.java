package br.com.livroandroid.fragments_tabs_viewpager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ViewPager
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));

        //Configura as Tabs
        final ActionBar actionBar = getSupportActionBar();

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("Frag 1").setTabListener(new MyTabListener(viewPager, 0)));
        actionBar.addTab(actionBar.newTab().setText("Frag 2").setTabListener(new MyTabListener(viewPager, 1)));
        actionBar.addTab(actionBar.newTab().setText("Frag 3").setTabListener(new MyTabListener(viewPager, 2)));

        // Se o ViewPager troca de página, atualiza a Tab.
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                // Se fizer swipe no ViewPager, atualiza a tab
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
}