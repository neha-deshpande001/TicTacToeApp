package com.example.neha.tictactoe;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

// use png or jpg images for android
// name the images numbers between one and nine (i.e. five)
// put them in the R.drawable folder

public class MainActivity extends AppCompatActivity {

    public static int imageChosen1;

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        configure();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("one", "inside");
                imageChosen1 = R.drawable.one;
                startActivity(new Intent(MainActivity.this, Player2Color.class));

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("two", "inside");
                imageChosen1 = R.drawable.two;
                startActivity(new Intent(MainActivity.this, Player2Color.class));
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("three", "inside");
                imageChosen1 = R.drawable.three;
                startActivity(new Intent(MainActivity.this, Player2Color.class));
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("four", "inside");
                imageChosen1 = R.drawable.four;
                startActivity(new Intent(MainActivity.this, Player2Color.class));
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("five", "inside");
                imageChosen1 = R.drawable.five;
                startActivity(new Intent(MainActivity.this, Player2Color.class));
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("six", "inside");
                imageChosen1 = R.drawable.six;
                startActivity(new Intent(MainActivity.this, Player2Color.class));
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("seven", "inside");
                imageChosen1 = R.drawable.seven;
                startActivity(new Intent(MainActivity.this, Player2Color.class));
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("eight", "inside");
                imageChosen1 = R.drawable.eight;
                startActivity(new Intent(MainActivity.this, Player2Color.class));
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("nine", "inside");
                imageChosen1 = R.drawable.nine;
                startActivity(new Intent(MainActivity.this, Player2Color.class));
            }
        });
    }

    private void configure() {
        TextView turn;

        turn = findViewById(R.id.turn);
        turn.setText("Player 1, choose your dog.");

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        setImages();

    }

    private void setImages() {
        one.setBackgroundResource(R.drawable.one);
        two.setBackgroundResource(R.drawable.two);
        three.setBackgroundResource(R.drawable.three);
        four.setBackgroundResource(R.drawable.four);
        five.setBackgroundResource(R.drawable.five);
        six.setBackgroundResource(R.drawable.six);
        seven.setBackgroundResource(R.drawable.seven);
        eight.setBackgroundResource(R.drawable.eight);
        nine.setBackgroundResource(R.drawable.nine);
    }
}





/*
1. penguin
2. monkey
3. tiger
4.
 */
