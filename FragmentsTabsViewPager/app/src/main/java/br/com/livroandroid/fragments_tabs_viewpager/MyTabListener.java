package br.com.livroandroid.fragments_tabs_viewpager;

import androidx.appcompat.app.ActionBar;
import android.app.FragmentTransaction;

import androidx.viewpager.widget.ViewPager;

public class MyTabListener implements ActionBar.TabListener
{
    private ViewPager viewPager;
    private int idx;

    public MyTabListener(ViewPager viewPager, int idx)
    {
        this.viewPager = viewPager;
        this.idx = idx;
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {
        // Navega para a pagina desejada do ViewPager
        viewPager.setCurrentItem(idx);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {

    }
}
