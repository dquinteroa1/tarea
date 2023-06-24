package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btguardar (View view)
    {

        EditText nombre = (EditText)findViewById(R.id.editName);
        EditText ciudad = (EditText)findViewById(R.id.editCiudad);
        EditText telefono = (EditText)findViewById(R.id.editTele);
        EditText correo = (EditText)findViewById(R.id.editCorreo);
        EditText cedula = (EditText)findViewById(R.id.editCedula);
        RadioButton sexo = (RadioButton) findViewById(R.id.rdMasculino);

        String name, city, cell, email, ci, sex;

        name=nombre.getText().toString();
        city=ciudad.getText().toString();
        cell=telefono.getText().toString();
        email=correo.getText().toString();
        ci=cedula.getText().toString();
        sex=sexo.isChecked()?"Masculino":"Femenino";

        Intent cambio = new Intent(MainActivity.this, secundaria.class);
        Bundle b = new Bundle();
        b.putString("NOMBRE", name);
        b.putString("CIUDAD", city);;
        b.putString("CORREO", email);
        b.putString("GENERO", sex);
        b.putString("CEDULA", ci);
        b.putString("TELEFONO", cell);
        cambio.putExtras(b);
        startActivity(cambio);

    }

    public void btCancelar (View view){
        EditText nombre = (EditText)findViewById(R.id.editName);
        EditText ciudad = (EditText)findViewById(R.id.editCiudad);
        EditText telefono = (EditText)findViewById(R.id.editTele);
        EditText correo = (EditText)findViewById(R.id.editCorreo);
        EditText cedula = (EditText)findViewById(R.id.editCedula);
        RadioButton sexo = (RadioButton) findViewById(R.id.rdMasculino);
        nombre.setText("");
        ciudad.setText("");
        telefono.setText("");
        correo.setText("");
        cedula.setText("");
        
    }
}