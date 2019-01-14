package com.example.aarias.promedionotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Declarar variables para los componentes de pantalla

    private EditText etMatematica;
    private EditText etFisica;
    private EditText etQuimica;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Enlace de mis variables con la parte grafica
        etMatematica = (EditText)findViewById(R.id.etMatematica);
        etFisica = (EditText)findViewById(R.id.etFisica);
        etQuimica = (EditText)findViewById(R.id.etQuimica);
        tvResultado = (TextView)findViewById(R.id.tvResultado);

    }

    public void Promedio(View view){

        //3. Traemos los valores en texto

        String sMatematica, sFisica, sQuimica;

        sMatematica = etMatematica.getText().toString();
        sFisica = etFisica.getText().toString();
        sQuimica = etQuimica.getText().toString();

        //4, Convertimos los valores a entero

        int iMatematica, iFisica, iQuimica;

        iMatematica = Integer.parseInt(sMatematica);
        iFisica = Integer.parseInt(sFisica);
        iQuimica = Integer.parseInt(sQuimica);

        //5. Hacemos el calculo de promedio

        int iPromedio;

        iPromedio = (iMatematica+iFisica+iQuimica)/3;

        if(iPromedio>=11){
            tvResultado.setText("Aprobado con: " + iPromedio);
        }else {
            tvResultado.setText("Desaprobado con: " + iPromedio);
        }
    }
}
