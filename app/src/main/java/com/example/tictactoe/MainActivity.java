package com.example.tictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1row1, btn2row1, btn3row1, btn1row2, btn2row2, btn3row2, btn1row3, btn2row3, btn3row3,reset,turn;
    int turn_round,count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1row1 = (Button) findViewById(R.id.btn1row1);
        btn2row1 = (Button) findViewById(R.id.btn2row1);
        btn3row1 = (Button) findViewById(R.id.btn3row1);
        btn1row2 = (Button) findViewById(R.id.btn1row2);
        btn2row2 = (Button) findViewById(R.id.btn2row2);
        btn3row2 = (Button) findViewById(R.id.btn3row2);
        btn1row3 = (Button) findViewById(R.id.btn1row3);
        btn2row3 = (Button) findViewById(R.id.btn2row3);
        btn3row3 = (Button) findViewById(R.id.btn3row3);
        reset = (Button) findViewById(R.id.reset);
        turn = (Button) findViewById(R.id.turn);

        turn_round = 1;

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               reset();
            }
        });

        btn1row1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btn1row1.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn1row1.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn1row1.setText("O");
                    }
                }
                endGame();
            }
        });

        btn2row1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btn2row1.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn2row1.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn2row1.setText("O");
                    }
                }

                endGame();
            }
        });

        btn3row1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btn3row1.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn3row1.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn3row1.setText("O");
                    }
                }
                endGame();
            }
        });

        btn1row2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btn1row2.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn1row2.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn1row2.setText("O");
                    }
                }
                endGame();
            }
        });

        btn2row2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btn2row2.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn2row2.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn2row2.setText("O");
                    }
                }
                endGame();
            }
        });

        btn3row2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (btn3row2.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn3row2.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn3row2.setText("O");
                    }
                }
                endGame();
            }
        });

        btn1row3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btn1row3.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn1row3.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn1row3.setText("O");
                    }
                }
                endGame();
            }
        });

        btn2row3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btn2row3.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn2row3.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn2row3.setText("O");
                    }
                }
                endGame();
            }
        });

        btn3row3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (btn3row3.getText().toString().equals("")) {
                    if (turn_round == 1) {
                        turn_round = 2;
                        btn3row3.setText("X");
                    } else if (turn_round == 2) {
                        turn_round = 1;
                        btn3row3.setText("O");
                    }
                }
                endGame();
            }
        });

    }


    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;
        count++;

        if(count%2==0)
            turn.setText("X");
        else
            turn.setText("O");
        a = btn1row1.getText().toString();
        b = btn2row1.getText().toString();
        c = btn3row1.getText().toString();
        d = btn1row2.getText().toString();
        e = btn2row2.getText().toString();
        f = btn3row2.getText().toString();
        g = btn1row3.getText().toString();
        h = btn2row3.getText().toString();
        i = btn3row3.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btn1row1.setBackgroundColor(Color.GRAY);
            btn2row1.setBackgroundColor(Color.GRAY);
            btn3row1.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btn1row1.setBackgroundColor(Color.GRAY);
            btn1row2.setBackgroundColor(Color.GRAY);
            btn1row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btn1row1.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn3row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btn2row1.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn2row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btn3row1.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn1row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btn3row1.setBackgroundColor(Color.GRAY);
            btn3row2.setBackgroundColor(Color.GRAY);
            btn3row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btn1row2.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn3row2.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(getApplicationContext(), "Winner is X", Toast.LENGTH_SHORT).show();
            btn1row3.setBackgroundColor(Color.GRAY);
            btn2row3.setBackgroundColor(Color.GRAY);
            btn3row3.setBackgroundColor(Color.GRAY);
            end = true;
        }


        else if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btn1row1.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn3row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btn1row1.setBackgroundColor(Color.GRAY);
            btn1row2.setBackgroundColor(Color.GRAY);
            btn1row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btn1row1.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn3row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btn2row1.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn2row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btn3row1.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn1row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btn3row1.setBackgroundColor(Color.GRAY);
            btn3row2.setBackgroundColor(Color.GRAY);
            btn3row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btn1row2.setBackgroundColor(Color.GRAY);
            btn2row2.setBackgroundColor(Color.GRAY);
            btn3row2.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(getApplicationContext(), "Winner is O", Toast.LENGTH_SHORT).show();
            btn1row3.setBackgroundColor(Color.GRAY);
            btn2row3.setBackgroundColor(Color.GRAY);
            btn3row3.setBackgroundColor(Color.GRAY);
            end = true;
        }
        else if(count==9)
        {
            Toast.makeText(getApplicationContext(),"Draw",Toast.LENGTH_SHORT).show();
            end=true;
        }

        if (end) {
            btn1row1.setEnabled(false);
            btn2row1.setEnabled(false);
            btn3row1.setEnabled(false);
            btn1row2.setEnabled(false);
            btn2row2.setEnabled(false);
            btn3row2.setEnabled(false);
            btn1row3.setEnabled(false);
            btn2row3.setEnabled(false);
            btn3row3.setEnabled(false);
        }
    }
    public void reset(){

        turn.setText("X");
        turn_round=1;
        btn1row1.setText("");
        btn2row1.setText("");
        btn3row1.setText("");
         btn1row2.setText("");
         btn2row2.setText("");
         btn3row2.setText("");
         btn1row3.setText("");
         btn2row3.setText("");
         btn3row3.setText("");


        btn1row1.setEnabled(true);
        btn2row1.setEnabled(true);
        btn3row1.setEnabled(true);
        btn1row2.setEnabled(true);
        btn2row2.setEnabled(true);
        btn3row2.setEnabled(true);
        btn1row3.setEnabled(true);
        btn2row3.setEnabled(true);
        btn3row3.setEnabled(true);

        btn1row3.setBackgroundColor(Color.BLACK);
        btn2row3.setBackgroundColor(Color.BLACK);
        btn3row3.setBackgroundColor(Color.BLACK);

        btn1row2.setBackgroundColor(Color.BLACK);
        btn2row2.setBackgroundColor(Color.BLACK);
        btn3row2.setBackgroundColor(Color.BLACK);


        btn1row1.setBackgroundColor(Color.BLACK);
        btn2row1.setBackgroundColor(Color.BLACK);
        btn3row1.setBackgroundColor(Color.BLACK);

        count=0;
    }
}