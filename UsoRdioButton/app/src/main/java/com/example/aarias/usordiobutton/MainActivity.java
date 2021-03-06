package com.example.aarias.usordiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
        tvResultado = (TextView)findViewById(R.id.tvResultado);

        //btCalcular.setOnClickListener(this);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(v);
            }
        });

    }

    public void Calcular(View v){

        // traemos los valores a numero
        int iValor1 = Integer.parseInt(etValor1.getText().toString());
        int iValor2 = Integer.parseInt(etValor2.getText().toString());
        int iResultado=0;
        String sResultado;

        if(rbSuma.isChecked() == true){
            iResultado = iValor1 + iValor2;
        }else if(rbResta.isChecked() == true){
            iResultado = iValor1 - iValor2;
        }else if(rbMultiplicar.isChecked() == true){
            iResultado = iValor1 * iValor2;
        }else if(rbDividir.isChecked() == true){
            if(iValor2 > 0){
                iResultado = iValor1/iValor2;
            }else{
                Toast.makeText(this, "Debe ser un valor mayor a cero", Toast.LENGTH_LONG).show();
                return;
            }
        }
        sResultado = String.valueOf(iResultado);
        tvResultado.setText(sResultado);
    }


    @Override
    public void onClick(View v) {
        this.Calcular(v);
    }
}
