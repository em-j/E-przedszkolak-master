package com.example.em.e_przedszkolak.LiterkiCyferki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.em.e_przedszkolak.R;

/**
 * Created by Em on 2016-05-17.
 */
public class C extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

    }
    public void onButtonOpenThree(View view) {

            Intent aIntent = new Intent(this, Three.class);
            startActivity(aIntent);

        finish();
    }

}
