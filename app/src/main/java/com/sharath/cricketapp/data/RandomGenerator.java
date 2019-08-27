package com.sharath.cricketapp.data;

import com.sharath.cricketapp.MyConstants;

import java.util.Random;

public class RandomGenerator {

    //public static Object secondInnScoreGen;

    public static int firstInnTarget() {
        Random r = new Random();
        int first_target_score = r.nextInt(MyConstants.firstInnMaxScore -MyConstants.firstInnMinScore) + MyConstants.firstInnMinScore;
        return first_target_score;
    }

    public static String secondInnScoreGen() {
        String[] eachBallValueList={"0","1", "2", "3", "4", "6","W","NB"};
        Random r=new Random();
        int randomNumber=r.nextInt(eachBallValueList.length);
        System.out.println(eachBallValueList[randomNumber]);
        String eachBallValue = eachBallValueList[randomNumber];
        return eachBallValue;
    }
}
