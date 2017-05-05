package com.example.em.e_przedszkolak.Owoce;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.em.e_przedszkolak.MainActivity;
import com.example.em.e_przedszkolak.R;

import java.util.Objects;

/**
 * Created by Em on 2016-05-04.
 */
public class Tomato extends AppCompatActivity {
    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);
        Intent aIntent = getIntent();



    }

    public void onButtonOpenMenuDone(View view) {
        theEditText = (EditText) findViewById(R.id.editTextTomato);

        String astrMessage = theEditText.getText().toString();

        if (Objects.equals(astrMessage, "pomidor")) {

            Intent aIntent = new Intent(this, MainActivity.class);
            startActivity(aIntent);
            finish();
        }
        else if (Objects.equals(astrMessage, "Pomidor")) {

            Intent aIntent = new Intent(this, MainActivity.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(Tomato.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();

        }


    }
}
