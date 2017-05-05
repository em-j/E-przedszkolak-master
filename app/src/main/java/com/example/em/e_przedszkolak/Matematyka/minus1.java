package com.example.em.e_przedszkolak.Matematyka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.em.e_przedszkolak.MainActivity;
import com.example.em.e_przedszkolak.R;

/**
 * Created by Em on 2016-06-01.
 */
public class minus1 extends AppCompatActivity {



    private Button btn_1, btn_2, btn_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_minus1);

        btn_1 = (Button) findViewById(R.id.btn_minus);
        btn_2 = (Button) findViewById(R.id.btn_minus1);
        btn_3 = (Button) findViewById(R.id.btn_wynik);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(minus1.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(minus1.this, "Spróbuj ponownie ", Toast.LENGTH_SHORT).show();
            }
        });




    }

    public void onButtonOpenWynik(View view){

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aIntent = new Intent(minus1.this, MainActivity.class);
                startActivity(aIntent);
            }
        });
        finish();
    }
}
