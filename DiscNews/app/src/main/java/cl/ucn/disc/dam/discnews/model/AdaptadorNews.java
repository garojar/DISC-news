package cl.ucn.disc.dam.discnews.model;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cl.ucn.disc.dam.discnews.R;

/**
 * Created by Germán Rojo on 01-11-2017.
 */

public class AdaptadorNews extends BaseAdapter {
    private LayoutInflater inflador; // crea layouts a partir del xml
    TextView titulo,descripcion;
    ImageView foto;
    private final List<Article> list;
    private final Activity activity;


    public AdaptadorNews(List<Article> list,Activity activity){
        inflador = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
        this.activity=activity;
    }


    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        if(view == null){
            view = inflador.inflate(R.layout.elemento_lista,null);
        }
        Article articulo = list.get(i);
        TextView titulo = (TextView)view.findViewById(R.id.titulo);
        titulo.setText(articulo.getTitle());
        TextView descripcion = (TextView)view.findViewById(R.id.descripcion);
        descripcion.setText(articulo.getDescription());
        return view;
    }
}
