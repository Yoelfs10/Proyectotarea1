package com.example.proyectoprimeraevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnsobrenosotros= findViewById(R.id.button5);
        btnsobrenosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = new Intent(MainActivity2.this, MainActivity7.class);


//Iniciamos la nueva actividad
                startActivity(intent4);


            }
        });

        Button btnreserva= findViewById(R.id.button2);

        btnreserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(MainActivity2.this, MainActivity6.class);


//Iniciamos la nueva actividad
                startActivity(intent3);

            }
        });

        Button btngaleria= findViewById(R.id.button);

        btngaleria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);


//Iniciamos la nueva actividad
                startActivity(intent);


            }

        });

        Button btnreservaonline= findViewById(R.id.button4);

        btnreservaonline.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent2 = new Intent(MainActivity2.this, MainActivity4.class);


//Iniciamos la nueva actividad
                startActivity(intent2);


            }

        });

        Button btnvolver= findViewById(R.id.button8);

        btnvolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);


//Iniciamos la nueva actividad
                startActivity(intent);


            }

        });



    }
}