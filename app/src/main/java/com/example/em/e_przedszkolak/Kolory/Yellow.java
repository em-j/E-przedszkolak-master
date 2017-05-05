package com.example.em.e_przedszkolak.Kolory;

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
 * Created by Em on 2016-04-20.
 */
public class Yellow extends AppCompatActivity {
    EditText theEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow);
        Intent aIntent = getIntent();

    }

    public void onButtonOpenMenu(View view) {
        theEditText = (EditText) findViewById(R.id.editTextYellow);

        String astrMessage = theEditText.getText().toString();

        if (Objects.equals(astrMessage, "żółty")) {
            Intent aIntent = new Intent(this, MainActivity.class);
            startActivity(aIntent);
            finish();
        } else if (Objects.equals(astrMessage, "Żółty")) {

            Intent aIntent = new Intent(this, MainActivity.class);
            startActivity(aIntent);
            finish();
        }
        else {
            Toast.makeText(Yellow.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();
        }

    }
}
