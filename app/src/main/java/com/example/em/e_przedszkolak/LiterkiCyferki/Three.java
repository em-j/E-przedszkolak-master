package com.example.em.e_przedszkolak.LiterkiCyferki;

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
 * Created by Em on 2016-05-17.
 */
public class Three extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

    }

    public void onButtonOpenMenu(View view) {
        EditText theEditText = (EditText) findViewById(R.id.editTextThree);

        String astrMessage = theEditText.getText().toString();

        if (Objects.equals(astrMessage, "Trzy")) {

            Intent aIntent = new Intent(this, MainActivity.class);
            startActivity(aIntent);
            finish();
        } else if (Objects.equals(astrMessage, "trzy")) {

            Intent aIntent = new Intent(this, MainActivity.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(Three.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();

        }

        finish();
    }
}
