package com.example.dm2.tanda3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad01_2 extends AppCompatActivity {

    Button botAceptar,botRechazar;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01_2);


        texto=findViewById(R.id.texto);
        String nombre=getIntent().getStringExtra("nombre");
        texto.setText("Hola "+nombre+" ¿aceptas las condiciones?");



    }

    public void verif(View view) {
        String str="";
        if(view.getId()==R.id.botAceptar){
            str="ACEPTADO";

        }

        if(view.getId()==R.id.botRechazar){

             str="RECHAZADO";

        }

        Intent intent = new Intent();
        intent.putExtra("resultado", str);
        setResult(RESULT_OK, intent);
        finish();

    }
}
