package com.sharath.cricketapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sharath.cricketapp.data.BolowingScoreSimulator;
import com.sharath.cricketapp.data.RandomGenerator;

import java.util.Random;

public class MainActivity extends Activity {

    TextView firstInnTarget,secondInnScoreTV, wickets,remBalls, winner;
    Button bolowingBtn;
    int secondInnScore, firstInnScore;
    int currentWickets;
    int currentBalls;
    int maxBalls = 30;
    int totalBalLeft = 30;
    String BatsmanName;
    String BowlerName;
    int totalWicket =5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstInnTarget = (TextView)findViewById(R.id.firstInnScore);
        secondInnScoreTV = (TextView)findViewById(R.id.secondInnScore);
        wickets = (TextView)findViewById(R.id.secondInnWicket);
        remBalls = (TextView)findViewById(R.id.secondInnBalls);
        bolowingBtn = (Button)findViewById(R.id.bowling);
        winner = (TextView)findViewById(R.id.winner);
        firstInnScore = RandomGenerator.firstInnTarget();
        firstInnTarget.setText(toString(firstInnScore));
        bolowingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                //secondInnScoreGen();
                eachBolowing();
            }
        });
        //RandomGenerator.firstInnTarget();
    }


    public void eachBolowing() {

        if(secondInnScore < firstInnScore) {
            if(maxBalls <=MyConstants.totalMaxBalls) {

                //Toast.makeText(,"Valid Ball", Toast.LENGTH_SHORT).show();
                if(RandomGenerator.secondInnScoreGen().equals("0")) {
                    //Dot Ball
                    maxBalls-=1;
                    totalBalLeft-=1;
                    remBalls.setText(toString(totalBalLeft));

                } else if(RandomGenerator.secondInnScoreGen().equals("1")) {
                    maxBalls-=1;
                    secondInnScore+=1;
                    totalBalLeft-=1;
                    secondInnScoreTV.setText(toString(secondInnScore));
                    remBalls.setText(toString(totalBalLeft));


                } else if(RandomGenerator.secondInnScoreGen().equals("2")) {

                    maxBalls-=1;
                    secondInnScore+=2;
                    totalBalLeft-=1;
                    secondInnScoreTV.setText(toString(secondInnScore));
                    remBalls.setText(toString(totalBalLeft));

                } if(RandomGenerator.secondInnScoreGen().equals("3")) {
                    //Dot Ball
                    maxBalls-=1;
                    secondInnScore+=3;
                    totalBalLeft-=1;
                    secondInnScoreTV.setText(toString(secondInnScore));
                    remBalls.setText(toString(totalBalLeft));

                } else if(RandomGenerator.secondInnScoreGen().equals("4")) {
                    maxBalls-=1;
                    secondInnScore+=4;
                    totalBalLeft-=1;
                    secondInnScoreTV.setText(toString(secondInnScore));
                    remBalls.setText(toString(totalBalLeft));

                } else if(RandomGenerator.secondInnScoreGen().equals("6")) {

                    maxBalls-=1;
                    secondInnScore+=6;
                    totalBalLeft-=1;
                    secondInnScoreTV.setText(toString(secondInnScore));
                    remBalls.setText(toString(totalBalLeft));

                } else if(RandomGenerator.secondInnScoreGen().equals("NB")) {
                    //maxBalls-=1;
                    secondInnScore+=1;
                    secondInnScoreTV.setText(toString(secondInnScore));
                    remBalls.setText(toString(totalBalLeft));
                    //totalBalLeft-=1;

                } else if(RandomGenerator.secondInnScoreGen().equals("W")) {

                    if(currentWickets < totalWicket) {
                        currentWickets +=1;
                        totalBalLeft-=1;
                        wickets.setText(toString(currentWickets));
                        remBalls.setText(toString(totalBalLeft));

                    } else {
                        //Winner
                        if(firstInnScore > secondInnScore) {
                            winner.setText("Team A is won by"+remBalls+"balls");
                        }
                    }

                }
            }
        } else {
            winner.setText("Team B is won");
        }

    }

    private String toString(int secondInnScore) {
        return String.valueOf(secondInnScore);
    }
}
