package com.example.em.e_przedszkolak.Zwierzeta;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;

import com.example.em.e_przedszkolak.R;

import java.util.Random;

/**
 * Created by Em on 2017-05-05.
 */

public class MemoryGame extends AppCompatActivity implements View.OnClickListener {
    private int numbersOfElements;
    private int[] buttonGraphicLocations;

    private MemoryButtonView selectedButton1;
    private MemoryButtonView selectedButton2;

    private boolean isBusy = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_game);

        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid_layout_4x4);

        int numColumn = gridLayout.getColumnCount();
        int numRow = gridLayout.getRowCount();

        numbersOfElements = numColumn * numRow;

        MemoryButtonView[] buttons = new MemoryButtonView[numbersOfElements];

        int[] buttonGraphic = new int[numbersOfElements / 2];




        buttonGraphic[0] = R.drawable.memory3;
        buttonGraphic[1] = R.drawable.memory4;
        buttonGraphic[2] = R.drawable.memory5;
        buttonGraphic[3] = R.drawable.memory6;
        buttonGraphic[4] = R.drawable.memory7;
        buttonGraphic[5] = R.drawable.memory8;
        buttonGraphic[6] = R.drawable.memory9;
        buttonGraphic[7] = R.drawable.memory10;


        buttonGraphicLocations = new int[numbersOfElements];

        shuffleButtonGraphics();

        for (int r = 0; r < numRow; r++) {
            for (int c = 0; c < numColumn; c++) {
                MemoryButtonView tempButton = new MemoryButtonView(this, r, c, buttonGraphic[buttonGraphicLocations[r * numColumn + c]]);
                tempButton.setId(View.generateViewId());
                tempButton.setOnClickListener(this);
                buttons[r * numColumn + c] = tempButton;
                gridLayout.addView(tempButton);
            }
        }

    }

    protected void shuffleButtonGraphics() {
        Random rand = new Random();

        for (int i = 0; i < numbersOfElements; i++) {
            buttonGraphicLocations[i] = i % (numbersOfElements / 2);
        }
        for (int i = 0; i < numbersOfElements; i++) {
            int temp = buttonGraphicLocations[i];
            int swapIndex = rand.nextInt(16);

            buttonGraphicLocations[i] = buttonGraphicLocations[swapIndex];
            buttonGraphicLocations[swapIndex] = temp;
        }
    }

    @Override
    public void onClick(View view) {
        if (isBusy) {
            return;
        }
        MemoryButtonView button = (MemoryButtonView) view;

        if (button.isMatched)
            return;

        if (selectedButton1 == null) {
            selectedButton1 = button;
            selectedButton1.flip();
            return;
        }

        if (selectedButton1.getId() == button.getId()) {
            return;
        }

        if (selectedButton1.getFrontDrawableId() == button.getFrontDrawableId()) {
            button.flip();

            button.setMatched(true);
            selectedButton1.setMatched(true);

            selectedButton1.setEnabled(false);
            button.setEnabled(false);

            selectedButton1 = null;

        } else {
            selectedButton2 = button;
            selectedButton2.flip();
            isBusy = true;

            final Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    selectedButton1.flip();
                    selectedButton2.flip();
                    selectedButton1 = null;
                    selectedButton2 = null;
                    isBusy = false;
                }
            }, 500);
        }
    }
}
