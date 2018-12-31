package com.system;

import com.gui.MastermindGUI;
import com.system.settings.Settings;

import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameFunctions extends Settings {




    public void EasyGameMode(){
        System.out.println("Easy");




    }

    public void MediumGameMode() {
        System.out.println("Medium");

        MasterChoiceOne = ThreadLocalRandom.current().nextInt(1, 6);
        MasterChoiceTwo = ThreadLocalRandom.current().nextInt(1, 6);
        MasterChoiceThree = ThreadLocalRandom.current().nextInt(1, 6);
        MasterChoiceFour = ThreadLocalRandom.current().nextInt(1, 6);

        int MasterChooses[] = {MasterChoiceOne, MasterChoiceTwo, MasterChoiceThree, MasterChoiceFour};

        do {
            for (; getTries() <= getMaxTries(); setTries(getTries() + 1)) {
                if (isEvaluated()) {
                    for (int i = 0; i < 4; i++) {
                        if (UserChooses[i] == MasterChooses[i]) {
                            setGameWon(true);
                            System.out.println("Game Won!!");
                        }
                    }
                    setEvaluated(false);
                }

            }
        } while(isEvaluated());

    }

    public void HardGameMode(){
        System.out.println("Hard");

    }

    private String MasterColor(int MasterChoice){

        switch (MasterChoice) {
            case 1:
                return "Black";
            case 2:
                return "White";
            case 3:
                return "Red";
            case 4:
                return "Purple";
            case 5:
                return "Green";
            case 6:
                return "Blue";
            default:
                return "none";
        }
    }
}
