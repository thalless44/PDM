package com.ifsc.contaclicks;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityBB extends AppCompatActivity {
    TextView  tvRe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bb);
        Log.d("Ciclo de vida","método OnCreate");

        tvRe = findViewById(R.id.tvRe);

        Intent intent = getIntent();
        double resultado = intent.getDoubleExtra("resultado_imc", 0.0);

        String resultadoFormatado = String.format("Seu IMC é: %.2f", resultado);
        tvRe.setText(resultadoFormatado);




        }
}
