package com.example.neha.tictactoe;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;


public class Player2Color extends AppCompatActivity {

    public static int imageChosen2;


    private TextView turn;

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button restart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player2_color);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        configure();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.one)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.one;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.two)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.two;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.three)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.three;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.four)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.four;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.five)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.five;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.six)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.six;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.seven)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.seven;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.eight)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.eight;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("red", "inside");
                if (MainActivity.imageChosen1 == R.drawable.nine)//.equals(MainActivity.RED_HEX))
                    turn.setText("You can't choose that because Player 1 chose that.");
                else {
                    imageChosen2 = R.drawable.nine;
                    startActivity(new Intent(Player2Color.this, Game.class));
                }
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageChosen2 = R.drawable.two;
                MainActivity.imageChosen1 = R.drawable.two;
                finish();
            }
        });
    }

    private void configure() {

        turn = findViewById(R.id.turn);
        turn.setText("Player 2, choose your dog.");

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        restart = findViewById(R.id.restart);

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
