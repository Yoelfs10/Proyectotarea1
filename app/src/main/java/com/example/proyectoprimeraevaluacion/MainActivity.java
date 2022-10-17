package com.example.proyectoprimeraevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button irmenu= findViewById(R.id.button3);

        irmenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


//Iniciamos la nueva actividad
                startActivity(intent);


            }

        });

    }
}