package com.example.dados;

import androidx.appcompat.app.AppCompatActivity;

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

        final ImageView dadoDisplay;

        dadoDisplay = findViewById(R.id.imageView2);

        final int[] dadoArray = {
                R.drawable.dado1,
                R.drawable.dado2,
                R.drawable.dado3,
                R.drawable.dado4,
                R.drawable.dado5,
                R.drawable.dado6,
        };

        Button button;
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();

                int randomIndex = randomNumberGenerator.nextInt( 6 );

                dadoDisplay.setImageResource(dadoArray[randomIndex]);
            }
        });


    }
}