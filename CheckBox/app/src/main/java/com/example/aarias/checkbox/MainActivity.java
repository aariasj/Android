package com.example.aarias.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etValor1, etValor2;
    private CheckBox cbSuma, cbResta;
    private Button btCalcular;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlazamos con la parte grafica

        etValor1 = (EditText)findViewById(R.id.etValor1);
        etValor2 = (EditText)findViewById(R.id.etValor2);
        cbSuma = (CheckBox)findViewById(R.id.cbSuma);
        cbResta = (CheckBox)findViewById(R.id.cbResta);
        btCalcular = (Button)findViewById(R.id.btCalcular);
        tvResultado = (TextView)findViewById(R.id.tvResultado);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(v);
            }
        });
    }

    public void Calcular(View v){

        //traer los numeros
        int iValor1 = Integer.parseInt(etValor1.getText().toString());
        int iValor2 = Integer.parseInt(etValor2.getText().toString());

        String sResultado = "";

        if(cbSuma.isChecked() == true){
            sResultado = "La suma es: " + Integer.toString((iValor1 + iValor2));

        }
        if(cbResta.isChecked()==true){
            if(sResultado.equals("")){
                sResultado = "la resta es: " + Integer.toString((iValor1 - iValor2));
            }else {
                sResultado = sResultado + " / la resta es: " + Integer.toString((iValor1 - iValor2));
            }

        }
        tvResultado.setText(sResultado);
    }
}
