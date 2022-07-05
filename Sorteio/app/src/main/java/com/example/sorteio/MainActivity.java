package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selcionarBotao(View v) {
        int numero = new Random().nextInt(11);
        TextView txt = findViewById(R.id.txtResultado);
        txt.setText("O número sorteado foi: " + numero);
    }
}