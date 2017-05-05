package com.example.em.e_przedszkolak.Owoce;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.em.e_przedszkolak.Owoce.Bananna;
import com.example.em.e_przedszkolak.R;

/**
 * Created by Em on 2016-04-13.
 */
public class MyVege extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_vege);
        Intent aIntent = getIntent();
    }

    public void onButtonOpenBanan(View view){
        Intent aIntent = new Intent(this, Bananna.class);
        startActivity(aIntent);
    }
}
