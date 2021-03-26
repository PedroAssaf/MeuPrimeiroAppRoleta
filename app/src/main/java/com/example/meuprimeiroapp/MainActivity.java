package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void RodarNumero(View view) {
        //Numero aleatorio sorteado
        TextView texto = findViewById(R.id.textView2);

        //texto informando se foi escolhido ou não
        TextView textoGanhador = findViewById(R.id.textView3);

        //Numero colocado escolhido para o sorteio
        EditText numeroInformado = findViewById(R.id.idNumberInput);

        //Geração de numero aleatorio
        Random random = new Random();
        int numero = random.nextInt(10) + 1;

        //Exibição do numero sorteado
        String numeroSorteado = String.valueOf(numero);
        texto.setText("Numero sorteado: " + numeroSorteado);

        //Verifica se o numero sorteado é o mesmo do escolhido
        if(numero == Integer.parseInt(numeroInformado.getText().toString())) {
            textoGanhador.setText("Parabens você ganhou");
        } else {
            textoGanhador.setText("Que pena... você perdeu");
        }


    }
}