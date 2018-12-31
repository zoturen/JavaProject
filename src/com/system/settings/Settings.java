package com.system.settings;

import javax.swing.*;

public class Settings {

    private boolean isRunning = false;
    private boolean gameWon = false;




    private boolean evaluated = false;

    private int tries = 1;



    private int maxTries = 10;

    private String difficulty;
    private String playerName;



    public int MasterChoiceOne;
    public int MasterChoiceTwo;
    public int MasterChoiceThree;
    public int MasterChoiceFour;


    public String MasterColorOne;
    public String MasterColorTwo;
    public String MasterColorThree;
    public String MasterColorFour;
    public String MasterColorFive;
    public String MasterColorSix;


    public int UserChoiceOne;
    public int UserChoiceTwo;
    public int UserChoiceThree;
    public int UserChoiceFour;
    public int UserChoiceFive;
    public int UserChoiceSix;

    public int UserChooses [] = {1, 2, 3, 4};

    public int evaluateUserChoices(int one, int two, int three, int four){
        do {
            UserChooses[0] = one;
            UserChooses[1] = two;
            UserChooses[2] = three;
            UserChooses[3] = four;

        } while(!isEvaluated());
        return -1;
    }


    public boolean isEvaluated() { return evaluated; }

    public boolean isRunning() {
        return isRunning;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public int getTries() {
        return tries;
    }

    public int getMaxTries() { return maxTries; }


    public String getDifficulty() {
        return difficulty;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void setGameWon(boolean gameWon) {
        this.gameWon = gameWon;
    }

    public void setTries(int triesLeft) {
        this.tries = triesLeft;
    }


    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setEvaluated(boolean evaluated) { this.evaluated = evaluated; }
}
