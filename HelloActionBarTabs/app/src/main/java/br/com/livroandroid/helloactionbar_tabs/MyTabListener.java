package br.com.livroandroid.helloactionbar_tabs;

import androidx.appcompat.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Context;
import android.widget.Toast;

public class MyTabListener implements ActionBar.TabListener {

    private Context context;
    private int tabIdx;

    public MyTabListener(Context context, int tabIdx)
    {
        this.context = context;
        this.tabIdx = tabIdx;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {
        //Chamado ao selecionar uma tab
        Toast.makeText(context, "Selecionou a tab" + tabIdx, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {
        // Chamado quando a tab perde o foco ( se outra tab é selecionada )
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {
        // Chamado quando uma tab e selecionada novamente.
    }
}
