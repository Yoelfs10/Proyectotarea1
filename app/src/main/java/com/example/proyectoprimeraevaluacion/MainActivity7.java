package com.example.proyectoprimeraevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Button sobrenosotros=findViewById(R.id.button12);
        sobrenosotros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                String url = "https://www.booking.com/content/about.es.html";
                Intent inte = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(inte);


            }

        });
        Button vuelta= findViewById(R.id.button13);

        vuelta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity7.this, MainActivity2.class);


//Iniciamos la nueva actividad
                startActivity(intent);


            }

        });
    }
}