package com.codecademy.cuartaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private Spinner spinner1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtn1);
        et2 = (EditText) findViewById(R.id.txtn2);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        tv1 = (TextView) findViewById(R.id.resultado);

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.spinner_personalizado, opciones);
        spinner1.setAdapter(adaptador);
    }

    public void Operar(View view) {
        String valor1String = et1.getText().toString();
        String valor2String = et2.getText().toString();

        int valor1 = Integer.parseInt(valor1String);
        int valor2 = Integer.parseInt(valor2String);

        String seleccion = spinner1.getSelectedItem().toString();

        if (seleccion.equals("Sumar")) {
            int suma = valor1 + valor2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        } else if (seleccion.equals("Restar")) {
            int resta = valor1 - valor2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        } else if (seleccion.equals("Multiplicar")) {
            int multiplicacion = valor1 * valor2;
            String resultado = String.valueOf(multiplicacion);
            tv1.setText(resultado);
        } else if (seleccion.equals("Dividir")) {
            int division = valor1 / valor2;
            String resultado = String.valueOf(division);
            tv1.setText(resultado);
        }
    }
}