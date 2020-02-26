package com.example.multiscreen;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = findViewById(R.id.contenedor);
        if(layout != null ) {
            // estoy en una tablet porque la pantalla tiene al menos 600dp de ancho


        }else{
            //movil

        }

    }
}
