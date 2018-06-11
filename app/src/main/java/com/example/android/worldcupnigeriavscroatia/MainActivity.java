package com.example.android.worldcupnigeriavscroatia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int nigeriaFoul = 0;
    int scoreNig = 0;
    int nigeriaPenalty = 0;
    int scoreCroatia = 0;
    int croatiaPenalty = 0;
    int croatiaFoul = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void crtGoal(View v){

        scoreCroatia = scoreCroatia + 1;
        displayForTeamB(scoreCroatia);
    }

    public  void  crtPenalty(View v){

        croatiaPenalty = croatiaPenalty + 1;
        displayForTeamB(croatiaPenalty);
    }

    public  void crtFoul(View v){
        croatiaFoul = croatiaFoul + 1;
        displayForTeamB(croatiaFoul);
    }

    public  void ngGoal(View v){
        scoreNig = scoreNig + 1;
        displayForTeamA(scoreNig);
    }

    public  void ngPenalty(View v){
        nigeriaPenalty = nigeriaPenalty + 1;
        displayForTeamA(nigeriaPenalty);
    }

    public  void  ngFoul(View v){

        nigeriaFoul = nigeriaFoul + 1;
        displayForTeamA(nigeriaFoul);
    }

    public  void  resetScore(View v){

        scoreCroatia = 0;
        scoreNig = 0;
        nigeriaFoul = 0;
        croatiaFoul=0;
        croatiaPenalty= 0;
        nigeriaFoul = 0;
        nigeriaPenalty= 0;
        displayScoreForNigeria(scoreNig);
        displayScoreForCroatia(scoreCroatia);
    }
    public void displayScoreForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ng_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForCroatia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.crt_goal);
        scoreView.setText(String.valueOf(score));
    }
    public void displayPenaltyForCroatia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.crt_penalty);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForCroatia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForCroatia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForCroatia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
