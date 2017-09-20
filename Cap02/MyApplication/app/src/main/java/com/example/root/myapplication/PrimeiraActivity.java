package com.example.root.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PrimeiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        //Acessar a Intent
        Intent it = getIntent();
        //Pegar o valor que está na Intent
        String nome = it.getStringExtra("nome");
        //Alimentar o TextView
        TextView tvNome =(TextView)findViewById(R.id.tv_nome);
        tvNome.setText(nome);

    }
}
