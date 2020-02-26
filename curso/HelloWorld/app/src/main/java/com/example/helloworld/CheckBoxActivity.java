package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    RadioGroup radioGroupAv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        radioGroupAv = findViewById(R.id.averia);
    }

    public void tipoAveriaSeleccionada(View view) {
        CheckBox cb = (CheckBox) view;
        boolean checked = cb.isChecked();
        int id = view.getId();
        switch (id) {
            case R.id.checkBoxChapa:
                Toast.makeText(this, "Chapa y pintura " + checked, Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBoxCristal:
                Toast.makeText(this, "Cristal " + checked, Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBoxMecanica:
                Toast.makeText(this, "Averia mecánica " + checked, Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void tipoAveriaSeleccionadaRadio(View view) {
        RadioButton rb = (RadioButton) view;
        boolean checked = rb.isChecked();
        int id = view.getId();
        switch (id) {
            case R.id.radioChapaPintura:
                Toast.makeText(this, "Chapa y pintura " + checked, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioCristal:
                Toast.makeText(this, "Cristal " + checked, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioAveria:
                Toast.makeText(this, "Averia mecánica " + checked, Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void conocerOpcionMarcada(View view) {
        int id = radioGroupAv.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radioChapaPintura:
                Toast.makeText(this, "Chapa y pintura", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioCristal:
                Toast.makeText(this, "Cristal", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioAveria:
                Toast.makeText(this, "Averia mecánica", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
