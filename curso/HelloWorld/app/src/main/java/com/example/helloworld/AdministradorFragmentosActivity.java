package com.example.helloworld;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class AdministradorFragmentosActivity extends AppCompatActivity {

    boolean cargarFragmento2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador_fragmentos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cargarFragmento2 = true;

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                if(cargarFragmento2) {
                    //reemplazo el fragmento que sale en la pantalla
                    // dentro del container
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.container, new SegundoFragment())
                            .commit();
                    cargarFragmento2 = false;
                }else{
                    //rescatamos el contenedor y le cargamos un fragmento
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.container, new PrimerFragment())
                            .commit();
                    cargarFragmento2 = true;
                }

            }
        });

    }

}
