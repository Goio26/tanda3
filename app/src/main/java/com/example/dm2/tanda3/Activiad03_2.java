package com.example.dm2.tanda3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activiad03_2 extends AppCompatActivity {

    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiad03_2);

        texto=findViewById(R.id.texto);

        String str=getIntent().getStringExtra("resul");

        texto.setText(str);



    }
}
