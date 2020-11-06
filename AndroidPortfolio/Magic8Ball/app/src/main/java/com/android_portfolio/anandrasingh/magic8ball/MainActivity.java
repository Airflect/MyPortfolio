package com.android_portfolio.anandrasingh.magic8ball;

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

        Button btn =(Button)findViewById(R.id.btn);
        final ImageView img =(ImageView)findViewById(R.id.img);
        final int [] eightballarray ={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator= new Random();
                int number =randomNumberGenerator.nextInt(5);
                img.setImageResource(eightballarray[number]);



            }
        });

    }
}
