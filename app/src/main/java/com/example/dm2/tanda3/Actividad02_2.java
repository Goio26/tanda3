package com.example.dm2.tanda3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad02_2 extends AppCompatActivity {

   private  TextView texto;
    private Button botV;
    private boolean bien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02_2);

        texto=findViewById(R.id.texto);
        botV=findViewById(R.id.botV);

        Bundle bu=getIntent().getExtras();
        Float num1=bu.getFloat("suma1");
        Float num2=bu.getFloat("suma2");
        Float resul=bu.getFloat("resul");


        if(num1+num2==resul){
            texto.setText("El resultado de la operacion es CORRECTO");
           bien=true;
        }else{
            texto.setText("El resultado de la operacion es ERRONEO");
            bien=false;
        }

        botV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent();
                in.putExtra("res",bien);
                setResult(RESULT_OK,in);
                finish();
            }
        });
    }
}
