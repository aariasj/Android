package com.example.aarias.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etValor1, etValor2;
    private TextView tvResultado;
    private RadioButton rbSuma, rbResta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = (EditText) findViewById(R.id.etNumero1);
        etValor2 = (EditText) findViewById(R.id.etNumero2);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        rbSuma = (RadioButton) findViewById(R.id.rbSumar);
        rbResta = (RadioButton) findViewById(R.id.rbRestar);
    }

    public void Calcular(View v){

        int valor1 = Integer.parseInt(etValor1.getText().toString());
        int valor2 = Integer.parseInt(etValor2.getText().toString());

        int resultado = 0;

        if(rbSuma.isChecked() == true){
            resultado = valor1 + valor2;
        }else if (rbResta.isChecked() == true){
            resultado = valor1 - valor2;
        }
        String Res = String.valueOf(resultado);

        tvResultado.setText(Res);

    }
}
