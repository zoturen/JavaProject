package com.system;

import com.gui.CreatePlayerNameWindow;
import com.gui.MastermindGUI;
import com.gui.WinScreen;
import com.system.settings.Settings;




public class Main {
    private Settings settings;
    private GameFunctions gameFunctions;
    private Game game;
    public CreatePlayerNameWindow playerChoice;
    public WinScreen winScreen;
    private MastermindGUI mainGUI;


    private Main(){
        this.settings = new Settings();
        this.gameFunctions = new GameFunctions(settings);
        this.mainGUI = new MastermindGUI(settings, gameFunctions);
        this.game = new Game(settings, gameFunctions, this,  mainGUI);
        this.playerChoice = new CreatePlayerNameWindow(settings, game);


        playerChoice.setVisible(true);
    }

    public void playAgain(){
        if (settings.isPlayAgain()){
            new Main();
            settings.setPlayAgain(false);
        }


    }

    public static void main(String[] args){

       new Main();




    }

}
