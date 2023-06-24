package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        TextView Datos = (TextView)findViewById(R.id.mensaje);
        Bundle b  = this.getIntent().getExtras();
        Datos.setText("Hola, has registrado estos datos:"+"\n"
                +"Nombre: "+b.getString("NOMBRE")+"\n"
                +"Ciudad: "+b.getString("CIUDAD")+"\n"
                +"Telefono: "+b.getString("TElEFONO")+"\n"
                +"Correo: "+b.getString("CORREO")+"\n"
                +"Cedula: "+b.getString("CEDULA")+"\n"
                +"Sexo: "+b.getString("GENERO"));


    }
}