package br.com.livroandroid.demo_views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImagemPagerAdapter extends PagerAdapter {

    private Context ctx;
    private final int[] imagens;

    public ImagemPagerAdapter(Context ctx, int[] imagens)
    {
        this.ctx = ctx;
        this.imagens = imagens;
    }

    @Override
    public int getCount() {  // Quantidade de views do adapter
        return imagens != null ? imagens.length : 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        // Infla a view

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
