package android.example.com.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA =0;
    int foulTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void addSixForTeamA(View v) {
        scoreTeamA=scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeForTeamA(View v) {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View v) {
        scoreTeamA=scoreTeamA+2;
    displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View v) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addfoulForTeamA(View v) {
        foulTeamA=foulTeamA+1;
        displayFoulTeamA(foulTeamA);
    }
    public void displayFoulTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }


    /**
     * Displays the given score for Team B.
     */
    public void addSixForTeamB(View v) {
        scoreTeamB=scoreTeamB+6;
        displayForTeamB(scoreTeamB);
    }
    public void addThreeForTeamB(View v) {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View v) {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View v) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addfoulForTeamB(View v) {
        foulTeamB=foulTeamB+1;
        displayFoulTeamB(foulTeamB);
    }
    public void displayFoulTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
        foulView.setTextColor(Color.CYAN);
    }



    public void resetAllScores(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        foulTeamA=0;
        foulTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
displayFoulTeamA(0);
displayFoulTeamB(0);
        Toast toastMessage = Toast.makeText(getApplicationContext(),"Scores are zero", Toast.LENGTH_SHORT);
        toastMessage.show();
    }
}
