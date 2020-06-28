package br.com.livroandroid.demo_views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImagemAdapter extends BaseAdapter {

    private Context ctx;
    private final int[] imagens;

    public ImagemAdapter(Context c, int[] imagens) {
        this.ctx = c;
        this.imagens = imagens;
    }

    @Override
    public int getCount() {
        return imagens.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        // Infla a view que está no XMl
        View view = LayoutInflater.from(this.ctx).inflate(R.layout.adapter_imagem, viewGroup, false);

        // Utiliza o findViewById para obter o ImageView
        ImageView img = (ImageView) view.findViewById(R.id.img);

        // Altera a imagem ( baseado na posicao do array )
        img.setImageResource(imagens[i]);

        //Retorna a view
        return view;

    }
}
