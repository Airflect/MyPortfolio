package com.android_portfolio.anandrasingh.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton = (Button)findViewById(R.id.btn);
       final ImageView dadoIzquierdo = (ImageView) findViewById(R.id.image_leftDice);
       final ImageView dadoDerecho = (ImageView)findViewById(R.id.image_rightDice);
       final int[] diceArray = {
               R.drawable.dice1,
               R.drawable.dice2,
               R.drawable.dice3,
               R.drawable.dice4,
               R.drawable.dice5,
               R.drawable.dice6
       };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int numero =randomNumberGenerator.nextInt(6);
                dadoIzquierdo.setImageResource(diceArray[numero]);
                numero = randomNumberGenerator.nextInt(6);
                dadoDerecho.setImageResource(diceArray[numero]);
            }
        });

        }

    }

