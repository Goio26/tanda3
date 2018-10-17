package com.example.dm2.tanda3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Actividad03 extends AppCompatActivity {


    RadioButton radio1,radio2;
    CheckBox check1,check2,check3,check4;
    EditText textoNom,textoApe;

    String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad03);

        radio1=findViewById(R.id.radio1);
        radio2=findViewById(R.id.radio2);
        check1=findViewById(R.id. check1);
        check2=findViewById(R.id. check2);
        check3=findViewById(R.id. check3);
        check4=findViewById(R.id. check4);
        textoNom=findViewById(R.id.textoNom);
        textoApe=findViewById(R.id.textoApe);




    }

    public void enviar(View v){

        str="Nombre: "+textoNom.getText().toString()+"\n Apellido: "+textoApe.getText().toString();

        String strAfi="\n Aficiones";

        if(radio1.isChecked()){
            str=str+"\n Sexo: "+radio1.getText().toString();
        }
        if(radio2.isChecked()){

            str=str+"\n Sexo: "+radio2.getText().toString();
        }
        if(check1.isChecked()){
            strAfi=strAfi+" "+check1.getText().toString();

        }
        if(check2.isChecked()){
            strAfi=strAfi+" "+check2.getText().toString();
        }
        if(check3.isChecked()){
            strAfi=strAfi+" "+check3.getText().toString();
        }
        if(check4.isChecked()){
            strAfi=strAfi+" "+check4.getText().toString();
        }
        str=str+strAfi;


        Intent intento=new Intent(Actividad03.this,Activiad03_2.class);
        intento.putExtra("resul",str);
        startActivity(intento);



    }

}
