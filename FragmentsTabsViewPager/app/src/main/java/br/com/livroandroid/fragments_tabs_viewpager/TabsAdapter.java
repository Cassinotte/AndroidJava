package br.com.livroandroid.fragments_tabs_viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {


    public TabsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int idx)
    {
        if(idx == 0) {
            return new Fragment1();
        }
        else if (idx == 1)
        {
            return new Fragment2();
        }

        return new Fragment3();

    }

    @Override
    public int getCount() {
        // O ViewPager vait ter 3 paginas
        return 3;
    }
}
