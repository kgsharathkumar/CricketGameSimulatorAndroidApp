package com.sharath.cricketapp.data;

import android.widget.Toast;

import com.sharath.cricketapp.MyConstants;

public class BolowingScoreSimulator {

    int secondInnScore;
    int currentWickets;
    int currentBalls;
    int maxBalls = 30;
    int totalBalLeft = 30;
    String BatsmanName;
    String BowlerName;
    int totalWicket =5;


    public void eachBolowing() {
        if(maxBalls <=MyConstants.totalMaxBalls) {

            //Toast.makeText(,"Valid Ball", Toast.LENGTH_SHORT).show();
            if(RandomGenerator.secondInnScoreGen().equals("0")) {
                //Dot Ball
                maxBalls-=1;
                totalBalLeft-=1;

            } else if(RandomGenerator.secondInnScoreGen().equals("1")) {
                maxBalls-=1;
                secondInnScore+=1;
                totalBalLeft-=1;


            } else if(RandomGenerator.secondInnScoreGen().equals("2")) {

                maxBalls-=1;
                secondInnScore+=2;
                totalBalLeft-=1;

            } if(RandomGenerator.secondInnScoreGen().equals("3")) {
                //Dot Ball
                maxBalls-=1;
                secondInnScore+=3;
                totalBalLeft-=1;

            } else if(RandomGenerator.secondInnScoreGen().equals("4")) {
                maxBalls-=1;
                secondInnScore+=4;
                totalBalLeft-=1;

            } else if(RandomGenerator.secondInnScoreGen().equals("6")) {

                maxBalls-=1;
                secondInnScore+=6;
                totalBalLeft-=1;

            } else if(RandomGenerator.secondInnScoreGen().equals("NB")) {
                //maxBalls-=1;
                secondInnScore+=1;
                //totalBalLeft-=1;

            } else if(RandomGenerator.secondInnScoreGen().equals("W")) {

                if(currentWickets < totalWicket) {
                    currentWickets +=1;

                } else {
                    //Winner
                }

            }
        }
    }
}
