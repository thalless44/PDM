package com.ifsc.contaclicks;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Ciclo de vida","método OnCreate");

        setContentView(R.layout.activity_main);

        edpeso = findViewById(R.id.edpeso);
        edaltura = findViewById(R.id.edaltura);
        tvresultado = findViewById(R.id.tvresultadoimc);
        buttonCalcular = findViewById(R.id.buttonCalcular);

        //Define um tratamento para o click do button
        buttonCalcular.setOnClickListener(v -> {

            double valorPeso = Double.parseDouble(edpeso.getText().toString());
            double valorAltura = Double.parseDouble(edaltura.getText().toString());

            double resultado = valorPeso / (valorAltura * valorAltura);

            Intent telaResultado = new Intent(this, MainActivityBB.class);
            telaResultado.putExtra("resultado_imc", resultado);
            startActivity(telaResultado);
        });


    }

}