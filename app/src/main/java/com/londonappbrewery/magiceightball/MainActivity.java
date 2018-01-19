package com.londonappbrewery.magiceightball;

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
        Button fortuneButton= findViewById(R.id.fortuneButton);
        final ImageView fortuneimage= findViewById(R.id.imageView);
        final int[] fortunearray= {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,
                            R.drawable.ball5};
        fortuneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGeneartor= new Random();
                int number = randomNumberGeneartor.nextInt(5);
                fortuneimage.setImageResource(fortunearray[number]);
            }
        });
    }
}
