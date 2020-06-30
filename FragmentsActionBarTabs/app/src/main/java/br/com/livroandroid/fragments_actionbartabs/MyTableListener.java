package br.com.livroandroid.fragments_actionbartabs;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.content.Context;

public class MyTableListener implements ActionBar.TabListener {

    private Context context;
    private Fragment frag;

    public MyTableListener(Context context, Fragment frag) {
        this.context = context;
        this.frag = frag;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {
        ft.replace(R.id.layoutFrag, this.frag, null);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {

    }
}
