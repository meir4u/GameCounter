package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected int scoreTeamA = 0;
    protected int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for team A by 1
     * @param view
     */
    public void add1ForTeamA(View view){
        this.scoreTeamA += 1;
        displayForTeamA(this.scoreTeamA);
    }

    /**
     * Increase the score for team A by 2
     * @param view
     */
    public void add2ForTeamA(View view){
        this.scoreTeamA += 2;
        displayForTeamA(this.scoreTeamA);
    }

    /**
     * Increase the score for team A by 3
     * @param view
     */
    public void add3ForTeamA(View view){
        this.scoreTeamA += 3;
        displayForTeamA(this.scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for team B by 1
     * @param view
     */
    public void add1ForTeamB(View view){
        this.scoreTeamB += 1;
        displayForTeamB(this.scoreTeamB);
    }

    /**
     * Increase the score for team B by 2
     * @param view
     */
    public void add2ForTeamB(View view){
        this.scoreTeamB += 2;
        displayForTeamB(this.scoreTeamB);
    }

    /**
     * Increase the score for team B by 3
     * @param view
     */
    public void add3ForTeamB(View view){
        this.scoreTeamB += 3;
        displayForTeamB(this.scoreTeamB);
    }

    public void reset(View view){
        this.scoreTeamA = 0;
        this.scoreTeamB = 0;
        this.displayForTeamA(this.scoreTeamA);
        this.displayForTeamB(this.scoreTeamB);
    }
}