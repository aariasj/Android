package com.example.aarias.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spOperacion;
    private EditText etValor1, etValor2;
    private Button btCalcular;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // enlace
        etValor1 = (EditText)findViewById(R.id.etValor1);
        etValor2 = (EditText)findViewById(R.id.etValor2);
        spOperacion = (Spinner)findViewById(R.id.spOperacion);
        btCalcular = (Button)findViewById(R.id.btCalcular);
        tvResultado = (TextView)findViewById(R.id.tvResultado);

        // creo arreglo para spinner

        String [] sOperaciones = {"Sumar","Restar", "Multiplicar", "Dividir"};

        // enlace del array con el spinner visual
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sOperaciones);
        spOperacion.setAdapter(adapter);

        // escuchar el clic
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(v);
            }
        });
    }

    public void Calcular(View v){

        int iValor1 = Integer.parseInt(etValor1.getText().toString());
        int iValor2 = Integer.parseInt(etValor2.getText().toString());
        int iResultado = 0;

        String sSeleccion = spOperacion.getSelectedItem().toString();

        if(sSeleccion.equals("Sumar")){
            iResultado = iValor1 + iValor2;
        }else if(sSeleccion.equals("Restar")){
            iResultado = iValor1 - iValor2;
        }else if(sSeleccion.equals("Multiplicar")){
            iResultado = iValor1 * iValor2;
        }else  if(sSeleccion.equals("Dividir")){
            if (iValor2>0){
                iResultado = iValor1 / iValor2;
            }else {
                Toast.makeText(this, "Debe ser un valor mayor a cero", Toast.LENGTH_LONG).show();
                return;
            }
        }
        tvResultado.setText(Integer.toString(iResultado));

    }
}
