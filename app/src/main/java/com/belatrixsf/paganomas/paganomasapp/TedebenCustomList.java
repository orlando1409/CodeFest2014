package com.belatrixsf.paganomas.paganomasapp;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jbenavides on 15/11/2014.
 */
public class TedebenCustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] Cuentas;
    private final String[] Fechas;
    private final Integer[] Imagenes;

    public TedebenCustomList(Activity context,String[] cuentas, String[] fechas, Integer[] imagenes) {
        super(context, R.layout.item_tedeben, cuentas);
        this.context = context;
        this.Cuentas = cuentas;
        this.Fechas = fechas;
        this.Imagenes = imagenes;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.item_tedeben, null, true);
        TextView txtxNombreCuenta = (TextView) rowView.findViewById(R.id.txtNombreCuenta);
        TextView txtFecha = (TextView) rowView.findViewById(R.id.txtFecha);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgStatus);

        txtxNombreCuenta.setText(Cuentas[position]);
        txtFecha.setText(Fechas[position]);
        imageView.setImageResource(Imagenes[position]);

        return rowView;
    }
}

/*
* ImageView imageView = (ImageView) rowView.findViewById(R.id.imgStatus);
txtTitle.setText(web[position]);
imageView.setImageResource(imageId[position]);
*
* */