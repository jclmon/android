package com.example.helloworld;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    GridView grid;
    List<Averia> averiasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        grid = findViewById(R.id.gridViewAverias);
        averiasList = new ArrayList<>();
        averiasList.add(new Averia("Espejo roto", "Renault 9", "https://thumbs.dreamstime.com/z/espejo-de-coche-quebrado-49758229.jpg", 2));
        averiasList.add(new Averia("Paragolpes delantero", "Citroen C4", "", 2));
        averiasList.add(new Averia("Embrague", "Seat ibiza", "", 0));
        averiasList.add(new Averia("Cambio aceite", "Seat toledo", "", 1));

        MiAdaptadorAverias adaptadorAverias = new MiAdaptadorAverias(this, R.layout.averia_grid_item, averiasList);
        grid.setAdapter(adaptadorAverias);
    }

    private class MiAdaptadorAverias extends ArrayAdapter<Averia> {
        Context ctx;
        int layoutTemplate;
        List<Averia> averiasList;

        public MiAdaptadorAverias(@NonNull Context context, int resource, @NonNull List<Averia> objects) {
            super(context, resource, objects);
            this.ctx = context;
            this.layoutTemplate = resource;
            this.averiasList = objects;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

            // Obtener la información del elemento de la lista que estoy iterando en este momento
            Averia elementoActual = averiasList.get(position);

            // Rescatar los elementos de la IU de la template
            TextView textViewTitulo = v.findViewById(R.id.textViewTitulo);
            TextView textViewPresupuestos = v.findViewById(R.id.textViewNumeroPresupuestos);
            ImageView imageViewFoto = v.findViewById(R.id.imageViewFoto);

            // HAcer un set de la info del elemento Actual en los elementos de la IU
            textViewTitulo.setText(elementoActual.getTitulo());
            textViewPresupuestos.setText(elementoActual.getNumeroPresupuestos()+ " Presupuestos");

            if(!elementoActual.getUrlImagen().isEmpty()) {
                Glide.with(ctx)
                        .load(elementoActual.getUrlImagen())
                        .into(imageViewFoto);
            }

            return v;
        }

    }
}
