package com.example.android.mysheep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    int scoreJumpOne = 0;
    int scoreJumpTwo = scoreJumpOne + 1;
    int scoreJumpThree = scoreJumpOne + scoreJumpTwo + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Jump Sheep One, Two and Three.
     */
    public void addOneForJump(View view) {
        scoreJumpOne = scoreJumpOne + 1;
        displayForJumpSheepOne(scoreJumpOne);
        scoreJumpTwo = scoreJumpTwo + 1;
        displayForJumpSheepTwo(scoreJumpTwo);
        scoreJumpThree = scoreJumpThree + 1;
        displayForJumpSheepThree(scoreJumpThree);
    }

    /**
     * Clear score for Jump.
     */
    public void reset(View view) {
        scoreJumpOne = 0;
        displayForJumpSheepOne(scoreJumpOne);
        scoreJumpTwo = scoreJumpOne + 1;
        displayForJumpSheepTwo(scoreJumpTwo);
        scoreJumpThree = scoreJumpOne + scoreJumpTwo + 1;
        displayForJumpSheepThree(scoreJumpThree);
    }

    /**
     * Displays the given score for Jump Sheep One.
     */
    public void displayForJumpSheepOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sheep_one_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Jump Sheep Two.
     */
    public void displayForJumpSheepTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sheep_two_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Jump Sheep Tree.
     */
    public void displayForJumpSheepThree(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sheep_three_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Jump.
     */
    public void displayForJump(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sheep_one_score_text_view);
        scoreView.setText(String.valueOf(score));
    }


}
