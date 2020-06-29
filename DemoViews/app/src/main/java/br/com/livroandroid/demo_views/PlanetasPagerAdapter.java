package br.com.livroandroid.demo_views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class PlanetasPagerAdapter extends PagerAdapter {

    private Context ctx;
    private final List<Planeta> planetas;

    public PlanetasPagerAdapter(Context c, List<Planeta> planetas)
    {
        this.ctx = c;
        this.planetas = planetas;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // Título para mostrar em um PagerTitleStrip ou PagerTabStrip
        Planeta planeta = planetas.get(position);
        return planeta.nome;
    }

    @Override
    public int getCount() {
        // Quantidade de views do adapter
        return planetas != null ? planetas.size() : 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        // Determina se a view informada é igual ao object retornado pelo instantiateItem
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        // Infla a view
        View view = LayoutInflater.from(this.ctx).inflate(R.layout.adapter_imagem, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Planeta planeta = planetas.get(position);
        img.setImageResource(planeta.img);
        // Adiciona no layout ViewGroup
        ((ViewGroup) container).addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // Remove do container
        ((ViewPager) container).removeView((View) object);
    }
}
