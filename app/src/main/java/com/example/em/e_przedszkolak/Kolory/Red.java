package com.example.em.e_przedszkolak.Kolory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.em.e_przedszkolak.R;

import java.util.Objects;

/**
 * Created by Em on 2016-04-20.
 */
public class Red extends AppCompatActivity{
    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);

    }



    public void onButtonOpenBlue(View view) {
        theEditText = (EditText) findViewById(R.id.editTextRed);

        String astrMessage = theEditText.getText().toString();
        if(Objects.equals(astrMessage, "czerwony")){

            Intent aIntent = new Intent(this, Blue.class);
            startActivity(aIntent);
            finish();
        }else if(Objects.equals(astrMessage, "Czerwony")){

            Intent aIntent = new Intent(this, Blue.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(Red.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();

        }

    }
}
