package com.example.em.e_przedszkolak.LiterkiCyferki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.em.e_przedszkolak.R;

/**
 * Created by Em on 2016-05-17.
 */
public class MyNumb extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_number);
     //   Intent aIntent = getIntent();
    }

    public void onButtonOpenRandomNumbers(View view) {
        Intent aIntent = new Intent(this, Two.class);
        startActivity(aIntent);
    }
}
