package com.codecademy.terceraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private RadioButton rb_suma, rb_resta, rb_multi, rb_div;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText)findViewById(R.id.txtn1);
        et2= (EditText)findViewById(R.id.txtn2);

        rb_suma= (RadioButton)findViewById(R.id.rb1);
        rb_resta= (RadioButton)findViewById(R.id.rb2);
        rb_multi= (RadioButton)findViewById(R.id.rb3);
        rb_div= (RadioButton)findViewById(R.id.rb4);

        tv_resultado= (TextView)findViewById(R.id.resultado);
    }

    public void operar(View view){

        String valor1String = et1.getText().toString();
        String valor2String = et2.getText().toString();

        int valor1= Integer.parseInt(valor1String);
        int valor2= Integer.parseInt(valor2String);

        int sumaResultado= valor1 + valor2;
        int restaResultado= valor1 - valor2;
        int multiResultado= valor1 * valor2;
        int divResultado= valor1 / valor2;

        if (rb_suma.isChecked()){
            String respuesta= String.valueOf(sumaResultado);
            tv_resultado.setText(respuesta);
        }
        else if(rb_resta.isChecked()){
            String resultado = String.valueOf(restaResultado);
            tv_resultado.setText(resultado);
        }
        else if(rb_multi.isChecked()){
            String resultado = String.valueOf(multiResultado);
            tv_resultado.setText(resultado);
        }
        else if(rb_div.isChecked()){
            String resultado = String.valueOf(divResultado);
            tv_resultado.setText(resultado);
        }
    }
}