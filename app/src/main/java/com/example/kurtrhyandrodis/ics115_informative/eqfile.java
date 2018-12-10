package com.example.kurtrhyandrodis.ics115_informative;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class eqfile extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eqfile);
    }

    public void process(View v){

        Intent i = null, chooser = null;
        if(v.getId() == R.id.eqBtn){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
