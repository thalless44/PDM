package com.ifsc.contaclicks;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edPeso, edAltura;
    Button buttoncalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edPeso=findViewById(R.id.edPeso);
        edAltura=findViewById(R.id.edAltura);
        tvResultado=findViewById(R.id.tvResultado);
        buttoncalcular.setOnClickListener(v->{
            //clacular
            double peso,altura,imc;
            peso=Double.parseDouble(edPeso.getText().toString());
            altura=Double.parseDouble(edAltura.getText().toString());
            imc=peso/(altura*altura);
//            Formatando numero ##,##
            DecimalFormat decimalFormat = new DecimalFormat("##,##");

            tvResultado.setText(Double.toString(imc));

        });

        }


}