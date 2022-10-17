package com.example.proyectoprimeraevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        CheckBox valor1= findViewById(R.id.checkBox);
        CheckBox valor2= findViewById(R.id.checkBox2);
        CheckBox valor3= findViewById(R.id.checkBox3);
        EditText txtHotel = findViewById(R.id.TxtNombre);
        Button btnenviar = findViewById(R.id.button7);
        btnenviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);

//Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("Hotel", txtHotel.getText().toString());
                Bundle b1 = new Bundle();
                if(valor1.isChecked()){
                    b1.putString("Terraza", valor1.getText().toString());
                }
                Bundle b2 = new Bundle();
                if(valor2.isChecked()){
                    b2.putString("Jardin", valor2.getText().toString());
                }
                Bundle b3 = new Bundle();
                if(valor3.isChecked()){
                    b3.putString("Biblioteca", valor3.getText().toString());
                }


//Añadimos la información al intent
                intent.putExtras(b);
                intent.putExtras(b1);
                intent.putExtras(b2);
                intent.putExtras(b3);

//Iniciamos la nueva actividad
                startActivity(intent);


            }

        });
        Button retorno= findViewById(R.id.button14);

        retorno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);


//Iniciamos la nueva actividad
                startActivity(intent);


            }

        });
    }



}
