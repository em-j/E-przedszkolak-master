package com.example.em.e_przedszkolak.Zwierzeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.em.e_przedszkolak.R;
import com.example.em.e_przedszkolak.Zwierzeta.Rabbit;

import java.util.Random;

/**
 * Created by Em on 2016-04-06.
 */
public class Pig extends AppCompatActivity {

    private ImageButton btnPig, btnCat, btnRabbit;
    private ImageView cienSwinka;

    private final String TAG_EJ = "EJ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pig);

        btnCat = (ImageButton) findViewById(R.id.btn_swinka_kot);
        btnRabbit = (ImageButton) findViewById(R.id.btn_swinka_krolik);
        btnPig = (ImageButton) findViewById(R.id.btn_swinka_swinka);
        cienSwinka = (ImageView) findViewById(R.id.cien_swinka);

        Glide.with(this).load(R.drawable.kot).into(btnCat);
        Glide.with(this).load(R.drawable.krolik).into(btnRabbit);
        Glide.with(this).load(R.drawable.swinka).into(btnPig);
        Glide.with(this).load(R.drawable.cien_swinka).into(cienSwinka);


    }


    public void onButtonOpenRandomPig(View view) {

        Random rnd = new Random();
        int x = rnd.nextInt(2) + 1;
        Intent intent = new Intent();
        switch (x) {
            case 1:
                intent.setClass(this, Cat.class);
                break;
            case 2:
                intent.setClass(this, Rabbit.class);
                break;
            default:
                Log.e(TAG_EJ, "zly numer" + x);
                break;

        }
//        intent.setClass(this, Rabbit.class);
        startActivity(intent);
        finish();
    }
}
