package com.system;

import com.gui.MastermindGUI;
import com.system.settings.Settings;

public class Game extends GameFunctions{
    private Settings settings;
    private MastermindGUI mainGUI;

    public Game(Settings settings){
        this.settings = settings;
        mainGUI = new MastermindGUI();
    }


    public void GameLoop() {

        mainGUI.setVisible(true);

        if (!settings.isGameWon() && settings.isRunning()) {

                switch (settings.getDifficulty()) {
                    case "Easy":
                        EasyGameMode();
                        break;
                    case "Medium":
                        MediumGameMode();
                        break;
                    case "Hard":
                        HardGameMode();
                        break;
                }
        } else {
            mainGUI.setVisible(false);

        }
    }
}
