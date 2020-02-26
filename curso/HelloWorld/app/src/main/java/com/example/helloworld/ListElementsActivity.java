package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListElementsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lista;
    private List<String> talleresList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_elements);

        this.talleresList = new ArrayList<>();
        this.talleresList.add("Taller sacacuartos 1");
        this.talleresList.add("Taller sacacuartos 2");
        this.talleresList.add("Taller sacacuartos 3");
        this.talleresList.add("Taller sacacuartos 4");

        ArrayAdapter<String> adaptadorLista = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                this.talleresList
        );

        lista = findViewById(R.id.listViewTalleres);
        lista.setAdapter(adaptadorLista);

        // evento click sobre elementos de esta lista
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
        Toast.makeText(this, "Taller seleccionado " + talleresList.get(posicion), Toast.LENGTH_SHORT).show();
        view.animate().rotationY(360).setDuration(1000).start();
    }

}
