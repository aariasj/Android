package com.example.aarias.botones;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvResultado;
    Button btBoton;
    Button btBoton2;

    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvResultado.setText("Uso segundo boton");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlace con la parte grafica
        tvResultado = (TextView)findViewById(R.id.tvTexto);
        btBoton = (Button)findViewById(R.id.btPrueba);
        btBoton2 = (Button)findViewById(R.id.btButton2);
        btBoton.setOnClickListener(myListener);
        btBoton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tvResultado.setText("OnLongClick");
                return true;
            }
        });
        btBoton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        tvResultado.setText("presionaste el boton");
    }
}
