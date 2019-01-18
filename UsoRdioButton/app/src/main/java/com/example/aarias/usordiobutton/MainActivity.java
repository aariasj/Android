package com.example.aarias.usordiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    private EditText etValor1, etValor2;
    private RadioButton rbSuma, rbResta, rbMultiplicar, rbDividir;
    private TextView tvResultado;
    private Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = (EditText)findViewById(R.id.etValor1);
        etValor2 = (EditText)findViewById(R.id.etValor2);
        rbSuma = (RadioButton)findViewById(R.id.rbSuma);
        rbResta = (RadioButton)findViewById(R.id.rbResta);
        rbMultiplicar = (RadioButton)findViewById(R.id.rbMultiplicar);
        rbDividir = (RadioButton)findViewById(R.id.rbDividir);
        btCalcular = (Button)findViewById(R.id.btCalcular);


    }

    public void Calcular(View v){

        // traemos los valores a numero
        int iValor1 = Integer.parseInt(etValor1.getText().toString());
        int iValor2 = Integer.parseInt(etValor2.getText().toString());
        int iResultado;

        if(rbSuma.isChecked() == true){
            iResultado = iValor1 + iValor2;
        }else if(rbResta.isChecked() == true){
            iResultado = iValor1 - iValor2;
        }else if(rbMultiplicar.isChecked() == true){
            iResultado = iValor1 * iValor2;
        }else if(rbDividir.isChecked() == true){
            
        }
    }


}
