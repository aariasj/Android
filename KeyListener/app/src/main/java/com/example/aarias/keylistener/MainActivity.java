package com.example.aarias.keylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);

        et1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if(event.getAction() == KeyEvent.ACTION_DOWN){
                    tv1.setText("");
                    tv1.setText("Presiono down " + keyCode + " " + KeyEvent.KEYCODE_ENTER);
                }
                /*else if(event.getAction() == KeyEvent.ACTION_UP){
                    tv1.setText("Solto");
                }*/


                return true;
            }
        });

        tv2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    tv2.setText("La toco, la toco");
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    tv2.setText("Sueltala");
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    tv2.setText("Muevela, muevela");
                }
                return true;
            }
        });
    }
}
