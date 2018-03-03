package com.example.user.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointerA(View view) {
        scoreA += 3;
        displayA(scoreA);
    }

    public void twoPointerA(View view) {
        scoreA += 2;
        displayA(scoreA);
    }

    public void freeThrowA(View view) {
        scoreA += 1;
        displayA(scoreA);
    }

    public void threePointerB(View view) {
        scoreB += 3;
        displayB(scoreB);
    }

    public void twoPointerB(View view) {
        scoreB += 2;
        displayB(scoreB);
    }

    public void freeThrowB(View view) {
        scoreB += 1;
        displayB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_teamA);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_teamB);
        quantityTextView.setText("" + number);
    }

}