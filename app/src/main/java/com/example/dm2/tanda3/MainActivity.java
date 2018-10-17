package com.example.dm2.tanda3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bot1,bot2,bot3,bot4,botS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void cerrar(View view) {
        this.finish();
    }

    public void acti(View v) {

        if(v.getId()==R.id.bot1){
            Intent intAct1 = new Intent(MainActivity.this, Actividad01.class);
            startActivity(intAct1);
        }

        if(v.getId()==R.id.bot2){
            Intent intAct2 = new Intent(this, Actividad02.class);
            startActivity(intAct2);
        }

        if(v.getId()==R.id.bot3){
            Intent intAct3 = new Intent(this, Actividad03.class);
            startActivity(intAct3);
        }

        if(v.getId()==R.id.bot4){
            Intent intAct4 = new Intent(this, Actividad04.class);
            startActivity(intAct4);
        }




    }
}
