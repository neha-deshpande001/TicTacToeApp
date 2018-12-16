package com.example.neha.tictactoe;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;


public class Game extends AppCompatActivity {

    private TextView turn;

    private Button topLeft;
    private Button topCenter;
    private Button topRight;
    private Button centerLeft;
    private Button centerCenter;
    private Button centerRight;
    private Button bottomLeft;
    private Button bottomCenter;
    private Button bottomRight;

    private Button restart;
    private Button newGame;

    private boolean playerONETurn = true;   // whose turn is it
    private Button currentBtn;  // current button
    private String[][] board = new String[3][3];

    private int x;  //current space
    private int y;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        configure();

        topLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 0;
                y = 0;
                Log.i("topLeft","inside onClickListener");
                currentBtn = topLeft;

                changeSpace();
                Log.i("topLeft","changeSpace() happened");
            }
        });
        topCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 1;
                y = 0;
                Log.i("topCenter","inside onClickListener");
                currentBtn = topCenter;

                changeSpace();
                Log.i("topCenter","changeSpace() happened");
            }
        });
        topRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 2;
                y = 0;
                Log.i("topRight","inside onClickListener");
                currentBtn = topRight;

                changeSpace();
                Log.i("topRight","changeSpace() happened");
            }
        });
        centerLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 0;
                y = 1;
                Log.i("centerLeft","inside onClickListener");
                currentBtn = centerLeft;

                changeSpace();
                Log.i("centerLeft","changeSpace() happened");
            }
        });
        centerCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 1;
                y = 1;
                Log.i("centerCenter","inside onClickListener");
                currentBtn = centerCenter;

                changeSpace();
                Log.i("centerCenter","changeSpace() happened");
            }
        });
        centerRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 2;
                y = 1;
                Log.i("centerRight","inside onClickListener");
                currentBtn = centerRight;

                changeSpace();
                Log.i("centerRight","changeSpace() happened");
            }
        });
        bottomLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 0;
                y = 2;
                Log.i("bottomLeft","inside onClickListener");
                currentBtn = bottomLeft;

                changeSpace();
                Log.i("bottomLeft","changeSpace() happened");
            }
        });
        bottomCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 1;
                y = 2;
                Log.i("bottomCenter","inside onClickListener");
                currentBtn = bottomCenter;

                changeSpace();
                Log.i("bottomCenter","changeSpace() happened");
            }
        });
        bottomRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 2;
                y = 2;
                Log.i("bottomRight","inside onClickListener");
                currentBtn = bottomRight;

                changeSpace();
                Log.i("bottomRight","changeSpace() happened");
            }
        });


        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game.this, MainActivity.class));
                finish();
            }
        });

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerONETurn = true;
                x = -1;
                y = -1;

                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        board[i][j] = ".";
                    }
                }

                resetColors();

                enableButtons(true);
                turn.setText("Player 1's turn");
                counter = 0;
            }
        });
    }

    private void changeSpace() {
        Log.i("counter", String.valueOf(counter));
        if (board[x][y].equals(".")) {
            if (playerONETurn) {
                //currentBtn.setBackgroundColor(Color.parseColor(MainActivity.colorString1));   ////////////////////////////////////////////////////////
                currentBtn.setBackgroundResource(MainActivity.imageChosen1);// <-- set image not color
                board[x][y] = "X";
                counter++;
            } else if (!playerONETurn) {
                currentBtn.setBackgroundResource(Player2Color.imageChosen2);// <-- set image not color
                board[x][y] = "O";
                counter++;
            }


            if (!won(board).equals("A")) {
                enableButtons(false);
                if (won(board).equals("X")) {
                    turn.setText("Player 1 wins! Press new game to play again.");
                }
                else if (won(board).equals("O")) {
                    turn.setText("Player 2 wins! Press new game to play again.");
                }
            }
            else if(!canWin(board, "X") && !canWin(board, "O")) {
                turn.setText("DRAW! Press new game to play again.");
                enableButtons(false);
            }
            else if (counter == 8 && !canWin(board,"X")) {
                turn.setText("DRAW! Press new game to play again.");
                enableButtons(false);
            }
            else {
                playerONETurn = !playerONETurn;
                if (playerONETurn)
                    turn.setText("Player 1's turn");
                else if (!playerONETurn)
                    turn.setText("Player 2's turn");
            }
        }
        else {
            Log.i("error!", "u cant play there!");
        }
    }

    public static boolean canWin(String[][] arr, String xORo) {
        String[][] copy = new String[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copy[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (copy[i][j].equals("."))
                    copy[i][j] = xORo;
            }
        }

        return (won(copy).equals("X") || won(copy).equals("O"));
    }

    private void configure() {

        turn = findViewById(R.id.turn);

        restart = findViewById(R.id.restart);
        newGame = findViewById(R.id.newGame);

        topLeft = findViewById(R.id.topLeft);
        topCenter = findViewById(R.id.two);
        topRight = findViewById(R.id.topRight);
        centerLeft = findViewById(R.id.four);
        centerCenter = findViewById(R.id.centerCenter);
        centerRight = findViewById(R.id.six);
        bottomLeft = findViewById(R.id.bottomLeft);
        bottomCenter = findViewById(R.id.eight);
        bottomRight = findViewById(R.id.bottomRight);


        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                board[i][j] = ".";
            }
        }
        resetColors();
    }

    private void enableButtons(boolean a) {
        topLeft.setEnabled(a);
        topCenter.setEnabled(a);
        topRight.setEnabled(a);
        centerLeft.setEnabled(a);
        centerCenter.setEnabled(a);
        centerRight.setEnabled(a);
        bottomLeft.setEnabled(a);
        bottomCenter.setEnabled(a);
        bottomRight.setEnabled(a);
    }

    private void resetColors() {
        topLeft.setBackgroundColor(Color.LTGRAY);
        topCenter.setBackgroundColor(Color.LTGRAY);
        topRight.setBackgroundColor(Color.LTGRAY);
        centerLeft.setBackgroundColor(Color.LTGRAY);
        centerCenter.setBackgroundColor(Color.LTGRAY);
        centerRight.setBackgroundColor(Color.LTGRAY);
        bottomLeft.setBackgroundColor(Color.LTGRAY);
        bottomCenter.setBackgroundColor(Color.LTGRAY);
        bottomRight.setBackgroundColor(Color.LTGRAY);
    }

    private static String won(String[][] arr) {
        // Horizontal
        for (int i = 0; i < arr.length; i++) {      // <-- not a bad idea, changing to for each loop instead of for
            for (int j = 0; j < arr[0].length - 2; j++) {
                if (arr[i][j].equals(arr[i][j+1]) && arr[i][j+1].equals(arr[i][j+2]) && !arr[i][j].equals("."))
                    return arr[i][j];
            }
        }

        // Vertical
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j].equals(arr[i+1][j]) && arr[i+1][j].equals(arr[i+2][j]) && !arr[i][j].equals("."))
                    return arr[i][j];
            }
        }

        // Diagonal - bottom left to top right
        for (int i = 2; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length - 2; j++) {
                if (arr[i][j].equals(arr[i-1][j+1]) && arr[i-1][j+1].equals(arr[i-2][j+2]) && !arr[i][j].equals("."))
                    return arr[i][j];
            }
        }

        // Diagonal - top left to bottom right
        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr[0].length; j++) {
                if (arr[i][j].equals(arr[i-1][j-1]) && arr[i-1][j-1].equals(arr[i-2][j-2]) && !arr[i][j].equals("."))
                    return arr[i][j];
            }
        }
        return "A";
    }

}



