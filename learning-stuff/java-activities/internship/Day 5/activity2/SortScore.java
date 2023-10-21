/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5.activity2;

/**
 *
 * @author Benzee
 */
public class SortScore extends Thread {

    @Override
    public void run() {
        String scoreArray[] = scoreString.split(",");

        int scores[] = new int[scoreArray.length];
        for (int i = 0; i < scoreArray.length; i++) {
            scores[i] = Integer.parseInt(scoreArray[i]);
        }
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                int tmp = 0;
                if (scores[i] > scores[j]) {
                    tmp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tmp;
                }
            }
        }
        this.scores = scores;
    }

    private String matchType;
    private String scoreString;
    private int[] scores;

    public String getMatchType() {
        return matchType;
    }

    public SortScore(String matchType, String scoreString) {
        this.matchType = matchType;
        this.scoreString = scoreString;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getScoreString() {
        return scoreString;
    }

    public void setScoreString(String scoreString) {
        this.scoreString = scoreString;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

}
