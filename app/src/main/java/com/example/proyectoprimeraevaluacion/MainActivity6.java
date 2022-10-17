package com.example.proyectoprimeraevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button reservatelefonica=findViewById(R.id.button10);
        reservatelefonica.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:34247"));
                startActivity(in);


            }

        });
        Button vuelta= findViewById(R.id.button11);

        vuelta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity6.this, MainActivity2.class);


//Iniciamos la nueva actividad
                startActivity(intent);


            }

        });
    }
}