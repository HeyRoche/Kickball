package com.example.android.kickball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Global variables for scores and outs for both teams.
    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;
    int outTeamOne = 0;
    int outTeamTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //The four methods below calculate runs scored.
    public void oneRunTeamOne(View View) {
        scoreTeamOne = scoreTeamOne + 1;
        teamOneDisplay(scoreTeamOne);
    }

    public void threeRunsTeamOne(View View) {
        scoreTeamOne = scoreTeamOne + 3;
        teamOneDisplay(scoreTeamOne);
    }

    public void fourRunsTeamOne(View View) {
        scoreTeamOne = scoreTeamOne + 4;
        teamOneDisplay(scoreTeamOne);
    }

    public void twoRunsTeamOne(View View) {
        scoreTeamOne = scoreTeamOne + 2;
        teamOneDisplay(scoreTeamOne);
    }

    // Calculates the outs for team One. The use of Toast in the app was learned from previous challenge course work.
    public void teamOneOuts(View view) {
        outTeamOne = outTeamOne + 1;
        if (outTeamOne > 3) {
            outTeamOne = 0;
            Toast.makeText(this, R.string.moreThan3Outs, Toast.LENGTH_SHORT).show();
        }
        teamOneOutDisplay(outTeamOne);
    }

    //The four methods below calculate runs scored.
    public void oneRunTeamTwo(View View) {
        scoreTeamTwo = scoreTeamTwo + 1;
        teamTwoDisplay(scoreTeamTwo);
    }

    public void threeRunsTeamTwo(View view) {
        scoreTeamTwo = scoreTeamTwo + 3;
        teamTwoDisplay(scoreTeamTwo);
    }

    public void fourRunsTeamTwo(View View) {
        scoreTeamTwo = scoreTeamTwo + 4;
        teamTwoDisplay(scoreTeamTwo);
    }

    public void twoRunsTeamTwo(View View) {
        scoreTeamTwo = scoreTeamTwo + 2;
        teamTwoDisplay(scoreTeamTwo);
    }

    //Calculates the outs for team Two.The use of Toast in the app was learned from previous challenge course work.
    public void teamTwoOuts(View view) {
        outTeamTwo = outTeamTwo + 1;
        if (outTeamTwo > 3) {
            outTeamTwo = 0;
            Toast.makeText(this, R.string.moreThan3Outs, Toast.LENGTH_SHORT).show();
        }
        teamTwoOutDisplay(outTeamTwo);
    }

    //These methods below reset the team outs when the appropriate button is clicked.
    public void resetTeamOneOuts(View view) {
        outTeamOne = 0;
        teamOneOutDisplay(outTeamOne);
    }

    public void resetTeamTwoOuts(View view) {
        outTeamTwo = 0;
        teamTwoOutDisplay(outTeamTwo);
    }

    //The four methods below display the score and the outs for each team.
    public void teamOneDisplay(int score) {
        TextView teamOneScoreView = findViewById(R.id.teamOneScore);
        teamOneScoreView.setText(String.valueOf(score));
    }

    public void teamTwoDisplay(int score) {
        TextView teamTwoScoreView = findViewById(R.id.teamTwoScore);
        teamTwoScoreView.setText(String.valueOf(score));
    }

    public void teamOneOutDisplay(int outs) {
        TextView teamOneOuts = findViewById(R.id.teamOneOuts);
        teamOneOuts.setText(String.valueOf(outs));
    }

    public void teamTwoOutDisplay(int outs) {
        TextView teamTwoOuts = findViewById(R.id.teamTwoOuts);
        teamTwoOuts.setText(String.valueOf(outs));
    }

    //Method resets the scores and outs for both teams in order to reset the entire game.
    public void resetGame(View view) {
        scoreTeamOne = 0;
        teamOneDisplay(scoreTeamOne);
        scoreTeamTwo = 0;
        teamTwoDisplay(scoreTeamTwo);
        outTeamOne = 0;
        teamOneOutDisplay(outTeamOne);
        outTeamTwo = 0;
        teamTwoOutDisplay(outTeamTwo);
    }
}


