package com.example.PrimerTrabajo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.PrimerTrabajo.models.ContactoModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView tv_detalle_informacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv_detalle_informacion = findViewById(R.id.tv_detalle_informacion);

        ContactoModel result = (ContactoModel) getIntent().getSerializableExtra("item");

        String nombreMostrar ="Nombre: " +result.get_nombre();
        String estadoMostrar = "Estado: " + result.get_estado();
        String mensajeMostrar = "Mensaje: " + result.get_mensaje();

        tv_detalle_informacion.setText("Detalle: \n\n" + nombreMostrar + "\n" +estadoMostrar
                + "\n" +mensajeMostrar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
