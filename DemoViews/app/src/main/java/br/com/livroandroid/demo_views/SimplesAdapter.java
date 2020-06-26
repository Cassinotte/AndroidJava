package br.com.livroandroid.demo_views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SimplesAdapter extends BaseAdapter {

    private String[] planetas = new String[] { "Mercúrio", "Vênus", "Terra", "Marte",
        "Júpiter", "Saturno", "Urano", "Neturno", "Plutão" };

    private Context context;

    public SimplesAdapter(Context contex)
    {
        super();
        this.context = contex; // O context é necessario para criar a view
    }

    @Override
    public int getCount() {
        return planetas.length;
    }

    @Override
    public Object getItem(int i) {
        return planetas[i]; // Retorna o objeto para esta posição
    }

    @Override
    public long getItemId(int i) {
        return i; // Retorno o id do objeto para esta posição
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        String planeta = planetas[i];

        View view = LayoutInflater.from(context).inflate(R.layout.adapter_simples, viewGroup, false);

        TextView t = (TextView) view.findViewById(R.id.text);

        //TextView t = new TextView(context);
        //float dip= 50;
        //float densidade = context.getResources().getDisplayMetrics().density; // Densidade
                                                                              // da tela

        //int px = (int) (dip * densidade * 0.5f);
        //t.setHeight(px);
        t.setText(planeta);

        return t;

    }
}
