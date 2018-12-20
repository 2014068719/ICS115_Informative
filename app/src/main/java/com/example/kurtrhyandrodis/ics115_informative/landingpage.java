package com.example.kurtrhyandrodis.ics115_informative;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class landingpage extends AppCompatActivity {

    Button Continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landingpage);
        Intent i = new Intent(this, Service.class);
        startService(i);

        Continue = findViewById(R.id.btncon);
    }

    public void LandingPageContinue(View v) {
        Intent I;

        if(Continue.getId() == R.id.btncon) {
            I = new Intent(this, MainActivity.class);
            startActivity(I);

//        if (v.getId() == R.id.btncon) {
//            i = new Intent(this, MainActivity.class);
//            startActivity(i);
//        }
        }
    }
}
