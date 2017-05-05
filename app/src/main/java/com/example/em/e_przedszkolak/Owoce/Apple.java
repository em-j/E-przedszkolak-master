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
public class Apple extends AppCompatActivity {
    EditText theEditText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

    }

    public void onButtonOpenPear(View view) {

        theEditText = (EditText) findViewById(R.id.editTextApple);


        String astrMessage = theEditText.getText().toString();

        if(Objects.equals(astrMessage, "jabłko")){

            Intent aIntent = new Intent(this, Pear.class);
            startActivity(aIntent);
            finish();
        }
        else if (Objects.equals(astrMessage, "Jabłko"))
        {
            Intent aIntent = new Intent(this, Pear.class);
            startActivity(aIntent);
            finish();}
        else {
            Toast.makeText(Apple.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();

        }

    }
}
