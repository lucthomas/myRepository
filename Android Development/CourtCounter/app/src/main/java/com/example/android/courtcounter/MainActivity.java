package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantityA = 0;
    int quantityB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds two points when the button +2 POINTS is pushed.
     */
    public void twoPointsA(View view){
        quantityA = quantityA + 2;
        displayTeamA(quantityA);
    }

    public void twoPointsB(View view){
        quantityB = quantityB + 2;
        displayTeamB(quantityB);
    }

    public void threePointsA(View view){
        quantityA = quantityA + 3;
        displayTeamA(quantityA);
    }

    public void threePointsB(View view){
        quantityB = quantityB + 3;
        displayTeamB(quantityB);
    }

    public void freeTrowA(View view){
        quantityA = quantityA + 1;
        displayTeamA(quantityA);
    }

    public void freeTrowB(View view){
        quantityB = quantityB + 1;
        displayTeamB(quantityB);
    }

    public void reset(View view){
        quantityA = 0;
        displayTeamA(quantityA);
        quantityB = 0;
        displayTeamB(quantityB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
