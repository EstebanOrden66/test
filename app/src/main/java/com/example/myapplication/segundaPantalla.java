package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class segundaPantalla extends AppCompatActivity {
    private TextInputLayout tilBuscar;
    private Button btnFiltrar;
    private ListView ltvTareas;
    private ArrayAdapter<Tarea> adaptadorTareasLista;
    private ArrayList<Tarea> lasTareasLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        referencias();
        obtenerDatos();
        eventos();



        adaptadorTareasLista = new ArrayAdapter<Tarea>(this, android.R.layout.simple_list_item_1, lasTareasLista);
        ltvTareas.setAdapter(adaptadorTareasLista);
    }

    private void obtenerDatos() {

        Tarea tarea = (Tarea) getIntent().getExtras().getSerializable("datosTarea");
        //String nombreComuna = getIntent().getExtras().getString("nombreComuna");
        //int poblacionComuna = getIntent().getExtras().getInt("poblacionComuna");
        //tvComuna.setText(nombreComuna);
        //tvPoblacion.setText(String.valueOf(poblacionComuna));


        //  for (int x = 0; x <= 1000; ++x) {
        //    Tarea c = new Tarea();
        //  c.setNombre("Comuna " + x);
        //c.setPoblacion(1200 + x);
        //  c.setAlcalde("El alcalde " + x);
        // c.setGrupoGSE("GSE " + x);
        //losComunasLista.add(c);
    }

    //Log.d("TAG_", "Alcalde " + comuna.getAlcalde());
    //Log.d("TAG_", "Dirección " + comuna.getDireccionMunicipalidad());


    //region Referencias y eventos

    private void referencias() {
        tilBuscar = findViewById(R.id.tilBuscar);
        btnFiltrar = findViewById(R.id.btnFiltrar);
        ltvTareas = findViewById(R.id.ltvTareas);


        lasTareasLista = new ArrayList<Tarea>();
    }

    private void eventos() {



        ltvTareas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int indiceSeleccionado, long id) {
                Tarea tareaSeleccionada = lasTareasLista.get(indiceSeleccionado);
                Toast.makeText(segundaPantalla.this, "La tarea  es " + tareaSeleccionada.getTitulo()
                        , Toast.LENGTH_SHORT).show();


            }
        });

        ltvTareas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Tarea tareaSeleccionada = lasTareasLista.get(position);
                Toast.makeText(segundaPantalla.this, "la Descripcion es " + tareaSeleccionada.getDescripcion()
                        , Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

    //endregion

    private void volver() {
        finish();
    }

}