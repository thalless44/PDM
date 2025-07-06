package com.ifsc.contaclicks;

import static com.ifsc.contaclicks.R.id.button;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;

    EditText edpeso, edaltura;
    TextView tvresultado;
    Button buttonCalcular;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Ciclo de vida","método OnCreate");

        setContentView(R.layout.activity_main);

        edpeso = findViewById(R.id.edpeso);
        edpeso.setText("80");
        edaltura = findViewById(R.id.edaltura);
        edaltura.setText("1.80");

        buttonCalcular = findViewById(R.id.button);

        //Define um tratamento para o click do button
        buttonCalcular.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivityBB.class);
            double peso = Double.parseDouble(edpeso.getText().toString());
            double altura = Double.parseDouble(edaltura.getText().toString());

            intent.putExtra("peso", peso);
            intent.putExtra("altura", altura);

            startActivity(intent);
        });


    }

}