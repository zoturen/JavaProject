package com.system.settings;

import java.util.ArrayList;
import java.util.List;

public class Settings {

    volatile private boolean isRunning = false;
    volatile private boolean gameWon = false;
    volatile private boolean evaluated = false;



    volatile private boolean gameLost = false;

    private int tries = 1;
    private int maxTries = 10;
    private int colorCounts;
    private String difficulty;
    private String playerName;



    public int MasterChoiceOne;
    public int MasterChoiceTwo;
    public int MasterChoiceThree;
    public int MasterChoiceFour;

    volatile public List<Integer> MasterChooses = new ArrayList<>();

    volatile public ArrayList<Integer> UserChoices = new ArrayList<Integer>(4);
    volatile public ArrayList<String> UserList = new ArrayList<>();

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
    public int getColorCounts() {
        return colorCounts;
    }
    public void setColorCounts(int colorCounts) {
        this.colorCounts = colorCounts;
    }
    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;
    }

    public boolean isGameLost() {
        return gameLost;
    }

    public void setGameLost(boolean gameLost) {
        this.gameLost = gameLost;
    }
}
