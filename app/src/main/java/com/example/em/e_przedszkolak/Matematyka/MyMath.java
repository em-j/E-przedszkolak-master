package com.example.em.e_przedszkolak.Matematyka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.em.e_przedszkolak.R;

/**
 * Created by Em on 2016-05-11.
 */
public class MyMath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_math);

    }

    public void onButtonOpenDodawanie(View view) {
        Intent aIntent = new Intent(this, plus1.class);
        startActivity(aIntent);
    }


    public void onButtonOpenOdejmowanie(View view) {
        Intent aIntent = new Intent(this, minus1.class);
        startActivity(aIntent);
    }

    public void onButtonOpenMnozenie(View view) {
        Intent aIntent = new Intent(this, razy1.class);
        startActivity(aIntent);
    }
}
