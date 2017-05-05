package com.example.em.e_przedszkolak.Zwierzeta;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.em.e_przedszkolak.MainActivity;
import com.example.em.e_przedszkolak.R;

import java.util.Random;

/**
 * Created by Em on 2016-04-06.
 */
public class Rabbit extends AppCompatActivity {

    private ImageButton btnRabbit, btnCat, btnSwinka;
    private ImageView cienKrolik;
    private final String TAG_EJ = "EJ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit);

        btnRabbit = (ImageButton) findViewById(R.id.btn_krolik_krolik);
        btnCat = (ImageButton) findViewById(R.id.btn_krolik_kot);
        btnSwinka = (ImageButton) findViewById(R.id.btn_krolik_swinka);
        cienKrolik = (ImageView) findViewById(R.id.cien_krolik);

        Glide.with(this).load(R.drawable.krolik).into(btnRabbit);
        Glide.with(this).load(R.drawable.kot).into(btnCat);
        Glide.with(this).load(R.drawable.swinka).into(btnSwinka);
        Glide.with(this).load(R.drawable.cien_krolik).into(cienKrolik);

    }


    public void onButtonOpenRandomRabbit(View view) {

        Random rnd = new Random();
        int x = rnd.nextInt(2) + 1;
        Intent intent = new Intent();
        switch (x) {
            case 1:
                intent.setClass(this, Pig.class);
                break;
            case 2:
                intent.setClass(this, Cat.class);
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
