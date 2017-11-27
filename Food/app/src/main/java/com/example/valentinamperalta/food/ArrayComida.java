package com.example.valentinamperalta.food;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by valentinam.peralta on 10/11/17.
 */

public class ArrayComida {

    public String barU[][] = {
            {"Empanada", "1.25"},
            {"Patacones", "1.50"},
            {"Humita", "1.50"},
            {"Tostada", "1.90"},
            {"Choridog", "1.10"},
            {"Muchines", "0.75"},
            {"Salchipapa", "2.25"},
            {"Hamburguesa con papas", "3.00"},
            {"Papas Fritas", "2.10"},
            {"Almuerzo", "3.00"}
    };

    public String caramelC[][] = {
            {"Cheescake de limon","3.00"},
            {"Cake de naranja","2.00"},
            {},
            {},
    };

    public ArrayList<String> getFood(String input) {
        ArrayList<String> resultados = new ArrayList<String>();
        String in = "";

        for (int i = 0; i < barU.length; i++) {
            if (input.compareTo(barU[i][1]) == 0) {
                in = barU[i][0];
                resultados.add(in);

            }
        }
        return resultados;
    }
}

