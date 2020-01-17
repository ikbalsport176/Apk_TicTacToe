package com.juara.apk_tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int chance=0;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,reset_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button1);

        btn2=(Button)findViewById(R.id.button2);

        btn3=(Button)findViewById(R.id.button3);

        btn4=(Button)findViewById(R.id.button4);

        btn5=(Button)findViewById(R.id.button5);

        btn6=(Button)findViewById(R.id.button6);

        btn7=(Button)findViewById(R.id.button7);

        btn8=(Button)findViewById(R.id.button8);

        btn9=(Button)findViewById(R.id.button9);

        reset_button=(Button)findViewById(R.id.reset);


        btn1.setOnClickListener(this);

        btn2.setOnClickListener(this);

        btn3.setOnClickListener(this);

        btn4.setOnClickListener(this);

        btn5.setOnClickListener(this);

        btn6.setOnClickListener(this);

        btn7.setOnClickListener(this);

        btn8.setOnClickListener(this);

        btn9.setOnClickListener(this);

        reset_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.button1:

                if(btn1.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn1.setText("O");


                        result();

                    }

                    else{

                        chance=0;

                        btn1.setText("X");

                        result();

                    }

                }

                break;

            case R.id.button2:

                if(btn2.getText().toString().equals("")){

                    if(chance==0){


                        chance=1;

                        btn2.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn2.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button3:

                if(btn3.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn3.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn3.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button4:

                if(btn4.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn4.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn4.setText("X");

                        result();

                    }

                }

                break;


            case R.id.button5:

                if(btn5.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn5.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn5.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button6:

                if(btn6.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn6.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn6.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button7:

                if(btn7.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn7.setText("O");

                        result();


                    }

                    else{

                        chance=0;

                        btn7.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button8:

                if(btn8.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn8.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn8.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button9:

                if(btn9.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn9.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn9.setText("X");

                        result();

                    }

                }

                break;

            case R.id.reset:

                btn1.setText("");

                btn2.setText("");

                btn3.setText("");

                btn4.setText("");

                btn5.setText("");

                btn6.setText("");

                btn7.setText("");

                btn8.setText("");

                btn9.setText("");



        }

    }


    public void result(){

        if(btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }

        else if(btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }


        else if(btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }


        else if(btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }

        else if(btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }


        else if(btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }




        else  if(btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }

        else if(btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }


        else if(btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }


        else if(btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }

        else if(btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }


        else if(btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }



        else if(btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }


        else if(btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }


        else if(btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }

        else if(btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset_button.callOnClick();

        }
    }
}
