package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout TilTarea,TiLDescripcion;

    private Button btnIngresar, btnModificar;
    String t,d;

    private ArrayList<Tarea> ListaTarea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencias();
        eventos();
    }

    private void grabarTarea() {

        Tarea t1 = new Tarea();
        t = TilTarea.toString();
        d= TiLDescripcion.toString();
        t1.setId(1);
        t1.setTitulo(t);
        t1.setDescripcion(d);
        ListaTarea.add(t1);
        Toast.makeText(this,"Tarea Guardada con Exito", Toast.LENGTH_LONG).show();


    }
    private void modificarTarea(){




    }


    //region Eventos y referencias
    private void eventos() {
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grabarTarea();
            }
        });
        btnModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modificarTarea();
            }
        });
    }

    private void referencias() {
        TilTarea = findViewById(R.id.TilTarea);
        btnIngresar = findViewById(R.id.btningresar);
        btnModificar = findViewById(R.id.btnModificar);
        TiLDescripcion=findViewById(R.id.TiLDescripcion);
    }


}
//endregion
