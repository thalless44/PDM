package com.ifsc.contaclicks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;
    String [] nomes= new String []{"Terra", "Mercurio", "Venus", "Jupiter"};
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
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),Planeta.class);
                i.putExtra("name", nomes[position]);

                startActivity(i);

            }
        });
        }

    }
