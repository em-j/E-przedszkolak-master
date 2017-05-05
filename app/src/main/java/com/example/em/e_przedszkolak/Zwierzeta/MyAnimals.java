package com.example.em.e_przedszkolak.Zwierzeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.em.e_przedszkolak.R;

import java.util.Random;

/**
 * Created by Em on 2016-04-06.
 */
public class MyAnimals extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_animals);
    }


    public void onButtonOpenRandomAnimals(View v) {
        Random rnd = new Random();
        int x = rnd.nextInt(3) + 1;
        Intent intent = new Intent();
        switch (x) {
            case 1:
                intent.setClass(this, Cat.class);
                break;
            case 2:
                intent.setClass(this, Pig.class);
                break;
            case 3:
                intent.setClass(this, Rabbit.class);
                break;

        }
        startActivity(intent);
    }


    public void onButtonOpenGraZwierzeta(View view) {
        Intent intent = new Intent(MyAnimals.this, MemoryGame.class);
        startActivity(intent);

    }
}