package com.example.helloworld;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentComunicationActivity extends AppCompatActivity implements OnControlesFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_comunication);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new ControlesFragment())
                .commit();
    }

    @Override
    public void botonColorClicked(String color) {
        Toast.makeText(this, "Color recibido " + color, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void botonTextoClicked(String texto) {
        Toast.makeText(this, "Texto recibido " + texto, Toast.LENGTH_SHORT).show();
    }
}
