package br.com.livroandroid.demo_views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlanetaAdapter extends BaseAdapter {

    private final Context context;
    private final List<Planeta> planetas;

    public PlanetaAdapter(Context context, List<Planeta> planetas)
    {
        this.context = context;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas != null ? planetas.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return planetas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        // Infla a view
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_planeta, viewGroup, false);
        // Faz findViewById das views que precisa atualizar
        TextView t = (TextView) view.findViewById(R.id.tNomePlaneta);
        ImageView img = (ImageView) view.findViewById(R.id.imgPlaneta);

        // Atualiza os valores das views
        Planeta planeta = planetas.get(i);
        t.setText(planeta.nome);
        img.setImageResource(planeta.img);

        // Retorna a view deste planeta
        return view;


    }
}
