package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class ImagenesVectorialesActivity extends AppCompatActivity {

    ImageView logoTipo;
    ImageView imgMark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes_vectoriales);
        logoTipo = findViewById(R.id.imageViewLogotipo);
        Picasso.get().load("http://miguelcamposrivera.com/logo_mecaround.png").into(logoTipo);

        imgMark = findViewById(R.id.imageViewMark);
        Glide.with(this)
                .load("http://miguelcamposrivera.com/logo_mecaround.png")
                .into(imgMark);

    }
}
