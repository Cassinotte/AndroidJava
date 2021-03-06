package br.com.livroandroid.fragments_actionbartabs;

import android.content.Context;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MyTabListener implements ActionBar.TabListener {
    private Context context;
    private Fragment frag;

    public MyTabListener(Context context, Fragment frag) {
        this.context = context;
        this.frag = frag;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // Troca o fragment dinamicamente ao clicar na Tab
        //ft.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out);
        //ft.setCustomAnimations(android.R.anim.slide_out_right,android.R.anim.slide_in_left);
        ft.setCustomAnimations(android.R.anim.slide_out_right,android.R.anim.slide_in_left);
        ft.replace(R.id.layoutFrag, this.frag, null);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // Chamado quando a tab perde o foco (se outra tab é selecionada)
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // Chamado quando uma tab é selecionada novamente.
    }
}
