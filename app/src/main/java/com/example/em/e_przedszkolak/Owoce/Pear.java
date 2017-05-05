package com.example.em.e_przedszkolak.Owoce;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.em.e_przedszkolak.R;

import java.util.Objects;

/**
 * Created by Em on 2016-04-13.
 */
public class Pear extends AppCompatActivity {
    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pear);

    }

    public void onButtonOpenCherry(View view) {

        theEditText = (EditText) findViewById(R.id.editTextPear);


        String astrMessage = theEditText.getText().toString();

        if(Objects.equals(astrMessage, "gruszka")){

            Intent aIntent = new Intent(this, Cherry.class);
            startActivity(aIntent);
            finish();
        }else if(Objects.equals(astrMessage, "Gruszka")){

            Intent aIntent = new Intent(this, Cherry.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(Pear.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();

        }

    }
}
