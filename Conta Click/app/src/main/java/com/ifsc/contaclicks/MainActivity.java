package com.ifsc.contaclicks;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    Button buttonIsere;
    EditText editText;

    ListView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = openOrCreateDatabase("banco",MODE_PRIVATE,null);

        db.execSQL("CREATE TABLE  IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, txt VARCHAR)");
        buttonIsere = findViewById(R.id.button);
        editText= findViewById(R.id.editTextText);
        view = findViewById(R.id.view);
        buttonIsere.setOnClickListener(v -> {
            String msg = editText.getText().toString();
            isereNota(msg);

        });
    }
    public void isereNota(String txt){
        ContentValues cv = new ContentValues();
        cv.put("txt",txt);
        db.insert("notas", null,cv);
    }

    public  void mostrarNota(String txt){
        Cursor cursor = db.rawQuery("SELECT * FROM notas", null);
        cursor.moveToFirst();
        ArrayList<String>  listaNotas= new ArrayList<String>();
        while(cursor.isAfterLast()){
            int coluna = cursor.getColumnIndex("txt");

            mostrarNota(cursor.getString(coluna));
            cursor.moveToNext();
        }
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1);

    }


}