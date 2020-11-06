package com.codecademy.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText entrada1;
    private EditText entrada2;
    private EditText entrada3;
    private TextView salida1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada1 = (EditText) findViewById(R.id.txtn1);
        entrada2 = (EditText) findViewById(R.id.txtn2);
        entrada3 = (EditText) findViewById(R.id.txtn3);
        salida1 = (TextView) findViewById(R.id.resultado);

    }

    public void promedio(View view){
        String mateString = entrada1.getText().toString();
        String fisicaString= entrada2.getText().toString();
        String españolString= entrada3.getText().toString();

        int mateInt= Integer.parseInt(mateString);
        int fisicaInt= Integer.parseInt(fisicaString);
        int españolInt= Integer.parseInt(españolString);

        double promedio = (mateInt+fisicaInt+españolInt)/3;

        if (promedio >= 6){
            salida1.setText("Aprobado.   Promedio: " + promedio);
        }
        else{
            salida1.setText("Reprobado.   Promedio: " + promedio);
        }

    }
}