package com.example.android.scoredashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initailize and declare all global variables

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     **********************  FOR  TEAM  A  **************************************
     */

    /**
     * Increase the goal for Team A
     */
    public void goalTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamScoreA(scoreTeamA);
    }

    /**
     * Increase the foul for Team A
     */
    public void foulTeamA(View view) {
        foulTeamA += 1;
        displayForTeamAFoul(foulTeamA);
    }

    /**
     * Increase the yellow card for Team A
     */
    public void yellowTeamA(View view) {
        yellowTeamA += 1;
        displayForTeamAYellow(yellowTeamA);
    }

    /**
     * Increase the red card for Team A
     */
    public void redTeamA(View view) {
        redTeamA += 1;
        displayForTeamRedA(redTeamA);
    }


    /**
     **********************  FOR  TEAM  B  **************************************
     */

    /**
     * Increase the goal for Team B
     */
    public void goalTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamScoreB(scoreTeamB);
    }

    /**
     * Increase the foul for Team B
     */
    public void foulTeamB(View view) {
        foulTeamB += 1;
        displayForTeamBFoul(foulTeamB);
    }

    /**
     * Increase the yellow card for Team B
     */
    public void yellowTeamB(View view) {
        yellowTeamB += 1;
        displayForTeamBYellow(yellowTeamB);
    }

    /**
     * Increase the red card for Team B
     */
    public void redTeamB(View view) {
        redTeamB += 1;
        displayForTeamRedB(redTeamB);
    }


    //for reset button

    public void resetAll(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;

        displayForTeamScoreA(scoreTeamA);
        displayForTeamScoreB(scoreTeamB);
        displayForTeamAFoul(foulTeamA);
        displayForTeamBFoul(foulTeamB);
        displayForTeamAYellow(yellowTeamA);
        displayForTeamBYellow(yellowTeamB);
        displayForTeamRedA(redTeamA);
        displayForTeamRedB(redTeamB);
    }


    //
    //
    // for display methods
    //
    //


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayForTeamAFoul(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayForTeamBFoul(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given Yellow Card for Team A.
     */
    public void displayForTeamAYellow(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the given Yellow Card for Team B.
     */
    public void displayForTeamBYellow(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the given Red Card for Team A.
     */
    public void displayForTeamRedA(int red) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the given Red Card for Team B.
     */
    public void displayForTeamRedB(int red) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(red));
    }


}
