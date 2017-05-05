package com.example.em.e_przedszkolak.LiterkiCyferki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.em.e_przedszkolak.LiterkiCyferki.C;
import com.example.em.e_przedszkolak.R;

import java.util.Objects;

/**
 * Created by Em on 2016-05-17.
 */
public class Two extends AppCompatActivity {

    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }

    public void onButtonOpenC(View view) {

        theEditText = (EditText) findViewById(R.id.editTextTwo);


        String astrMessage = theEditText.getText().toString();

        if(Objects.equals(astrMessage, "Dwa")){

            Intent aIntent = new Intent(this, C.class);
            startActivity(aIntent);
            finish();
        }
        else if (Objects.equals(astrMessage, "dwa")){
            Intent aIntent = new Intent(this, C.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();

        }
    finish();
    }


}
