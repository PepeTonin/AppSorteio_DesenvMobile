package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textNumeroSorteado;
    EditText inputLimiteSuperiorNumeroAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLimiteSuperiorNumeroAleatorio = findViewById(R.id.inputNumero);
        textNumeroSorteado = findViewById(R.id.textNumeroSorteado);

    }

    public void sortearNumero(View view){
        Random gerador = new Random();
        try {
            int limiteSuperiorNumeroAleatorio = Integer.parseInt(inputLimiteSuperiorNumeroAleatorio.getText().toString());
            int numAleatorio = gerador.nextInt(limiteSuperiorNumeroAleatorio);
            textNumeroSorteado.setText(String.valueOf(numAleatorio));
        } catch(Exception e) {
            textNumeroSorteado.setText("Por favor, digite um numero");
        }
    }
}