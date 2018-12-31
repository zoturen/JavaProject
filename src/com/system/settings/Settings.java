package com.system.settings;

public class Settings {

    private boolean isRunning = false;
    private boolean gameWon = false;

    private int triesLeft = 10;

    private String difficulty;
    private String playerName;


    public boolean isRunning() {
        return isRunning;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public int getTriesLeft() {
        return triesLeft;
    }

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

    public void setTriesLeft(int triesLeft) {
        this.triesLeft = triesLeft;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
