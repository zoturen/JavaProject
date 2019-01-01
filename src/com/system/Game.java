package com.system;

import com.gui.MastermindGUI;
import com.system.settings.Settings;


public class Game {
    private Settings settings;
    private MastermindGUI mainGUI;
    private GameFunctions gameFunctions;



    public Game(Settings settings, GameFunctions gameFunctions){
        this.settings = settings;
        this.gameFunctions = gameFunctions;
        mainGUI = new MastermindGUI(settings, gameFunctions);

    }

    public class NewThread extends Thread{

        @Override
        public void run() {



            if (!settings.isGameWon() && settings.isRunning()) {

                switch (settings.getDifficulty()) {
                    case "Easy":
                        settings.setColorCounts(4);
                        settings.setMaxTries(8);
                        gameFunctions.EasyGameMode();
                        break;
                    case "Normal":
                        settings.setColorCounts(4);
                        settings.setMaxTries(14);
                        gameFunctions.MediumGameMode();
                        break;
                    case "Hard":
                        settings.setColorCounts(6);
                        settings.setMaxTries(20);
                        gameFunctions.HardGameMode();
                        break;
                }
            } else {
                mainGUI.setVisible(false);

            }
        }
    }

    public void GameLoop() {



        Thread gameThread = new NewThread();
        gameThread.start();
        mainGUI.setVisible(true);

    }
}
