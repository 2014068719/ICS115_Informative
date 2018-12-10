package com.example.kurtrhyandrodis.ics115_informative;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, Service.class);
        startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId()==R.id.btn1) {
            i = new Intent(this, floodfile.class);
            startActivity(i);
        } else
            if (v.getId()==R.id.btn3) {
            i = new Intent(this, eqfile.class);
            startActivity(i);
        } else
            if (v.getId()==R.id.btn2) {
            i = new Intent(this, typhoonfile.class);
            startActivity(i);
        }
    }
}
