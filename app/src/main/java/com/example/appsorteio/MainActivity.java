package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textNumeroSorteado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNumeroSorteado = findViewById(R.id.textNumeroSorteado);
    }

    public void sortearNumero(View view){
        Random gerador = new Random();
        int numAleatorio = gerador.nextInt(11);
        textNumeroSorteado.setText(String.valueOf(numAleatorio));
    }
}