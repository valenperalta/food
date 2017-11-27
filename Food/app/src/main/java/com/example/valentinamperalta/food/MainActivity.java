package com.example.valentinamperalta.food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText valueText;
    private Button searchButton;

    ArrayComida restaurantes = new ArrayComida();

    ArrayList<String> comida = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueText = (EditText)findViewById(R.id.valueT);
        searchButton = (Button)findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view)
                    {
                        comida = restaurantes.getFood(valueText.getText().toString());

                        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                        intent.putExtra("passedComida", comida);
                        startActivity(intent);

                    }
                });
    }
}

