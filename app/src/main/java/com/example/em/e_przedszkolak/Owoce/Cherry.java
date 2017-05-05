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
public class Cherry extends AppCompatActivity {
    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cherry);

    }

    public void onButtonOpenCarrot(View view) {

        theEditText = (EditText) findViewById(R.id.editTextCherry);


        String astrMessage = theEditText.getText().toString();

        if(Objects.equals(astrMessage, "wiśnia")){
            Intent aIntent = new Intent(this, Carrot.class);
            startActivity(aIntent);
            finish();
        }else if(Objects.equals(astrMessage, "Wiśnia")){
            Intent aIntent = new Intent(this, Carrot.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(Cherry.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();

        }

    }
}
