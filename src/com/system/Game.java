package com.system;

import com.gui.MastermindGUI;
import com.gui.WinScreen;
import com.system.settings.Settings;


public class Game {
    private Settings settings;
    private MastermindGUI mainGUI;
    private GameFunctions gameFunctions;
    private Main main;
    private WinScreen winScreen;



    public Game(Settings settings, GameFunctions gameFunctions, Main main, WinScreen winScreen, MastermindGUI mainGUI){
        this.settings = settings;
        this.gameFunctions = gameFunctions;
        this.mainGUI = mainGUI;
        this.main = main;
        this.winScreen = winScreen;

    }

    public class NewThread extends Thread{

        @Override
        public void run() {

            while (!settings.isGameWon() && settings.isRunning()) {

                switch (settings.getDifficulty()) {
                    case "Easy":
                        settings.setColorCounts(4);
                        settings.setMaxTries(10);
                        settings.setTries(1);
                        gameFunctions.EasyGameMode();
                        winScreen.setVisible(true);
                        try {
                            join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "Normal":
                        settings.setColorCounts(4);
                        settings.setMaxTries(10);
                        settings.setTries(1);
                        gameFunctions.MediumGameMode();
                        winScreen.setVisible(true);
                        try {
                            join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "Hard":
                        settings.setColorCounts(6);
                        settings.setMaxTries(10);
                        settings.setTries(1);
                        gameFunctions.HardGameMode();
                        winScreen.setVisible(true);
                        try {
                            join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }
            mainGUI.setVisible(false);


        }
    }

    public void GameLoop() {



        Thread gameThread = new NewThread();
        gameThread.start();
        mainGUI.setVisible(true);

    }
}
