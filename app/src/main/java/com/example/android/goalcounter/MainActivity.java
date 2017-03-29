package com.example.android.goalcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    int player1a=0;
    int player2a=0;
    int player3a=0;
    int player4a=0;
    int player5a=0;
    int player6a=0;
    int player1b=0;
    int player2b=0;
    int player3b=0;
    int player4b=0;
    int player5b=0;
    int player6b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoalA (View view) {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    public void Player1a (View view) {
        player1a = player1a +1;
        aExpulsion1(player1a);
    }

    public void Player2a (View view){
        player2a = player2a +1;
        aExpulsion2(player2a);
    }

    public void Player3a (View view){
        player3a = player3a +1;
        aExpulsion3(player3a);
    }

    public void Player4a (View view){
        player4a = player4a +1;
        aExpulsion4(player4a);
    }

    public void Player5a (View view){
        player5a = player5a +1;
        aExpulsion5(player5a);
    }

    public void Player6a (View view){
        player6a = player6a +1;
        aExpulsion6(player6a);
    }

    public void GoalB (View view) {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    public void Player1b (View view){
        player1b = player1b +1;
        bExpulsion1(player1b);
    }

    public void Player2b (View view){
        player2b = player2b +1;
        bExpulsion2(player2b);
    }

    public void Player3b (View view){
        player3b= player3b +1;
        bExpulsion3(player3b);
    }

    public void Player4b (View view){
        player4b= player4b +1;
        bExpulsion4(player4b);
    }

    public void Player5b (View view){
        player5b = player5b +1;
        bExpulsion5(player5b);
    }

    public void Player6b (View view){
        player6b = player6b +1;
        bExpulsion6(player6b);
    }

    public void Reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        player1a=0;
        player2a=0;
        player3a=0;
        player4a=0;
        player5a=0;
        player6a=0;
        player1b=0;
        player2b=0;
        player3b=0;
        player4b=0;
        player5b=0;
        player6b=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        aExpulsion1(player1a);
        aExpulsion2(player2a);
        aExpulsion3(player3a);
        aExpulsion4(player4a);
        aExpulsion5(player5a);
        aExpulsion6(player6a);
        bExpulsion1(player1b);
        bExpulsion2(player2b);
        bExpulsion3(player3b);
        bExpulsion4(player4b);
        bExpulsion5(player5b);
        bExpulsion6(player6b);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void aExpulsion1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.a_expulsion1);
        scoreView.setText(String.valueOf(score));
    }

    public void aExpulsion2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.a_expulsion2);
        scoreView.setText(String.valueOf(score));
    }

    public void aExpulsion3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.a_expulsion3);
        scoreView.setText(String.valueOf(score));
    }

    public void aExpulsion4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.a_expulsion4);
        scoreView.setText(String.valueOf(score));
    }

    public void aExpulsion5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.a_expulsion5);
        scoreView.setText(String.valueOf(score));
    }

    public void aExpulsion6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.a_expulsion6);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void bExpulsion1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_expulsion1);
        scoreView.setText(String.valueOf(score));
    }

    public void bExpulsion2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_expulsion2);
        scoreView.setText(String.valueOf(score));
    }

    public void bExpulsion3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_expulsion3);
        scoreView.setText(String.valueOf(score));
    }

    public void bExpulsion4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_expulsion4);
        scoreView.setText(String.valueOf(score));
    }

    public void bExpulsion5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_expulsion5);
        scoreView.setText(String.valueOf(score));
    }

    public void bExpulsion6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_expulsion6);
        scoreView.setText(String.valueOf(score));
    }
}

