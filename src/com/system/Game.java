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
        mainGUI = new MastermindGUI(settings);

    }

    public class NewThread extends Thread{

        private NewThread(){

        }

        @Override
        public void run() {



            if (!settings.isGameWon() && settings.isRunning()) {

                switch (settings.getDifficulty()) {
                    case "Easy":
                        gameFunctions.EasyGameMode();
                        break;
                    case "Normal":
                        gameFunctions.MediumGameMode();
                        break;
                    case "Hard":
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
