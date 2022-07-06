package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selcionarBotao(View v) {
        String resultado;
        int number;

        EditText inputNumber = findViewById(R.id.inputNumber);
        number = Integer.parseInt(inputNumber.getText().toString());

        int randon = new Random().nextInt(11);

        TextView txt = findViewById(R.id.txtResultado);
        resultado = "ERROU";
        if(number == randon) {
            resultado = "ACERTOU";
        }
        txt.setText("Você " + resultado + ", o número sorteado foi: " + randon);
    }
}