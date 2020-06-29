package br.com.livroandroid.demo_views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

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
        View view = LayoutInflater.from(this.ctx).inflate(R.layout.adapter_imagem, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        img.setImageResource(imagens[position]);
        // Adiciona no layout ViewGroup
        ((ViewGroup) container).addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull View container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
