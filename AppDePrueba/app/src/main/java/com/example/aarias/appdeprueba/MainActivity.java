package com.example.aarias.appdeprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // enlace con la parte grafica

        et1 = (EditText)findViewById(R.id.nNumero1);
        et2 = (EditText)findViewById(R.id.nNumero2);
        tv1 = (TextView)findViewById(R.id.nResultado);

    }

    public void Sumar(View view){

        // recuperar valores de la pantalla

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        // pasar a numero
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = Integer.toString(suma);

        // pasar al texto de resultado

        tv1.setText(result);
    }


}
