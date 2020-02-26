package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecicledViewActivity extends AppCompatActivity implements OnClickAveriaListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicled_view);
    }

    @Override
    public void onAveriaClick(Averia averia) {

    }
}
