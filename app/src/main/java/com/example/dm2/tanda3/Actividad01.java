package com.example.dm2.tanda3;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad01 extends AppCompatActivity {

    Button botVerificar,botVolver;
    TextView texto1,texto2,textoCon;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==123 && resultCode==RESULT_OK){
            String resp=data.getStringExtra("resultado");
            textoCon.setText("Aceptas condiciones: "+resp);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01);

        botVolver=findViewById(R.id.botVolver);
        botVerificar=findViewById(R.id.botVerificar);

        texto1=findViewById(R.id.texto1);
        texto2=findViewById(R.id.texto2);
        textoCon=findViewById(R.id.textoCon);


    }

    public void verificar(View view) {
        String str=texto1.getText()+" "+texto2.getText();

        Intent intento=new Intent(this,Actividad01_2.class);
        intento.putExtra("nombre",str);
        startActivityForResult(intento,123);


    }

    public void volver(View view) {
        Intent intentoV=new Intent(this,MainActivity.class);
        startActivity(intentoV);
    }
}
