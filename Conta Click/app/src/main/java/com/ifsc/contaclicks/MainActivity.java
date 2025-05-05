package com.ifsc.contaclicks;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;
    String [] nomes= new String []{"Amanda", "Anne", "João", "João2"};
    ListView lv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperar o listView
        lv = findViewById(R.id.id_view);

        //Adaptador
        ArrayAdapter<String> a = new ArrayAdapter(
            this, R.layout.itens,R.id.textView, nomes);
        lv.setAdapter(a);



    }
}