package com.example.proyectoprimeraevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        TextView txtVerificacion = findViewById(R.id.Hotelreservado);
        Bundle bundle = this.getIntent().getExtras();
        txtVerificacion.setText("Ha reservado el hotel " + bundle.getString("Hotel") + " " + "con los servicios:" + bundle.getString("Terraza") + " " + bundle.getString("Jardin") + " " + bundle.getString("Biblioteca"));

        Button vuelta= findViewById(R.id.button9);

        vuelta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);


//Iniciamos la nueva actividad
                startActivity(intent);


            }

        });

    }
}