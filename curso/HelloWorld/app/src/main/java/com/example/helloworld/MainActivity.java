package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("cicloVida", "onCreate");
        texto = findViewById(R.id.textoEvento);
        texto.setOnClickListener(this);
//        texto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // initSecActivity(view);
//                Toast.makeText(MainActivity.this, "Click con escuchador", Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_new_averia:
                Toast.makeText(this, "Nueva averia", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_buscar:
                Toast.makeText(this, "Busqueda de averia", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onStart() {
        Log.i("cicloVida", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("cicloVida", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("cicloVida", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("cicloVida", "onStop");
        super.onStop();
    }


    @Override
    public void onClick(View view) {
//        int id = view.getId();
//        if(id == R.id.textoEvento) {
//            initSecActivity(view);
//        }
        // intent explicito
        Intent intentSecond = new Intent(this, SecondActivity.class);
        intentSecond.putExtra("numero", 5);
        intentSecond.putExtra("nombre", "JC");
        startActivity(intentSecond);

    }


    public void initLinearLayoutActivity(View view) {
        // Toast.makeText(this, "Init second activity", Toast.LENGTH_LONG).show();
        // intent explicito
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);

    }

    public void initRelativeLayoutActivity(View view) {
        // Toast.makeText(this, "Init second activity", Toast.LENGTH_LONG).show();
        // intent explicito
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        startActivity(intent);

    }

    public void initBotonesActivity(View view) {
        Intent intent = new Intent(this, BotonesActivity.class);
        startActivity(intent);
    }

    public void initCheckBoxActivity(View view) {
        Intent intent = new Intent(this, CheckBoxActivity.class);
        startActivity(intent);
    }

    public void initImagenesVectorialesActivity(View view) {
        Intent intent = new Intent(this, ImagenesVectorialesActivity.class);
        startActivity(intent);
    }

    public void initConstraintLayoutActivity(View view) {
        Intent intent = new Intent(this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }


    public void initFragmentActivity(View view) {
        Intent intent = new Intent(this, FragmentActivity.class);
        startActivity(intent);
    }

    public void initAdministradorFragmentActivity(View view) {
        Intent intent = new Intent(this, AdministradorFragmentosActivity.class);
        startActivity(intent);
    }

    public void initFragmentListActivity(View view) {
        Intent intent = new Intent(this, FragmentListActivity.class);
        startActivity(intent);
    }

    public void initComunicationFragmentActivity(View view) {
        Intent intent = new Intent(this, FragmentComunicationActivity.class);
        startActivity(intent);
    }

    public void initMultiScreenActivity(View view) {
        Intent intent = new Intent(this, MultScreenActivity.class);
        startActivity(intent);
    }

    public void initDialogFragmentActivity(View view) {
        Intent intent = new Intent(this, DialogFragmentActivity.class);
        startActivity(intent);
    }

    public void initScrollingActivity(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }

    public void initListElementsActivity(View view) {
        Intent intent = new Intent(this, ListElementsActivity.class);
        startActivity(intent);
    }

    public void initListElementsAdapterActivity(View view) {
        Intent intent = new Intent(this, ListElementsCustomAdapterActivity.class);
        startActivity(intent);
    }

    public void initGridViewAdapterActivity(View view) {
        Intent intent = new Intent(this, GridViewActivity.class);
        startActivity(intent);
    }

    public void initRecycledViewActivity(View view) {
        Intent intent = new Intent(this, RecicledViewActivity.class);
        startActivity(intent);
    }
    
}
