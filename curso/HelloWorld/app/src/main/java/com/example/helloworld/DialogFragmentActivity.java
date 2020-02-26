package com.example.helloworld;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;

import android.view.View;
import android.widget.Toast;

public class DialogFragmentActivity extends AppCompatActivity implements OnNuevaAveriaListener {

    DialogFragment dialogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogo = new NuevoItemDialog();
                dialogo.show(getSupportFragmentManager(), "Nueva avería diálogo");
            }
        });
    }

    @Override
    public void onAveriaGuardarClickListener() {
        Toast.makeText(this, "Averia guardada", Toast.LENGTH_SHORT).show();
    }
}
