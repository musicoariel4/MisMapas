package com.musicoariel4.mismapas;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchSecondActivity(View view) {

        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent); //envio de intent con codigo de solicitud
    }
    public void launchSecondActivity2(View view) {

        Intent intent = new Intent(this,MapsActivity2.class);
        startActivity(intent); //envio de intent con codigo de solicitud
    }
    public void launchSecondActivity3(View view) {

        Intent intent = new Intent(this,MapsActivity3.class);
        startActivity(intent); //envio de intent con codigo de solicitud
    }
    public void launchSecondActivity4(View view) {

        Intent intent = new Intent(this,MapsActivity4.class);
        startActivity(intent); //envio de intent con codigo de solicitud
    }
}