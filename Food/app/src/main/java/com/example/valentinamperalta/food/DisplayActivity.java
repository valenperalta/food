package com.example.valentinamperalta.food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {

    private TextView titulo;
    private TextView lista;

    private Button back;

    ArrayList<String> listado = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        titulo = (TextView)findViewById(R.id.textView);
        lista = (TextView)findViewById(R.id.textView2);

        back = (Button)findViewById(R.id.backButton);

        Intent intent = getIntent();


        listado = intent.getStringArrayListExtra("passedComida");

         for (int i = 0; i < listado.size(); i++){
             lista.append(listado.get(i));
             lista.append("\n");
         }

         back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(DisplayActivity.this, MainActivity.class);
                 startActivity(intent);
             }
         });
    }
}

