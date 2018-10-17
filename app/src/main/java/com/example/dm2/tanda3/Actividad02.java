package com.example.dm2.tanda3;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad02 extends AppCompatActivity {

    Button bot;
    EditText suma1,suma2,resul;
    private int var1,var2;
    TextView texto1,texto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);

        bot=findViewById(R.id.bot);
        suma1=findViewById(R.id.suma1);
        suma2=findViewById(R.id.suma2);
        resul=findViewById(R.id.resul);
        texto1=findViewById(R.id.texto1);
        texto2=findViewById(R.id.texto2);
        var1 = 0;
        var2=0;


        suma1.setText(String.valueOf((int) (Math.random()*100+1)));
        suma2.setText(String.valueOf((int) (Math.random()*100+1)));

        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Actividad02.this,Actividad02_2.class);
                Bundle b=new Bundle();
                b.putFloat("suma1",Float.parseFloat(suma1.getText().toString()));
                b.putFloat("suma2",Float.parseFloat(suma2.getText().toString()));
                b.putFloat("resul", Float.parseFloat(resul.getText().toString()));
               intento.putExtras(b);
               startActivityForResult(intento,123);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode==123 && resultCode==RESULT_OK){
            boolean bien=data.getExtras().getBoolean("res");
            if(bien){
                var1++;
                texto1.setText("PREGUNTAS CORRECTAS "+var1);

            }else{
                var2++;
                texto2.setText("PREGUNTAS CORRECTAS "+var2);
            }
        }
    }
}
