package com.system;

import com.gui.MastermindGUI;
import com.system.settings.Settings;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameFunctions {

    private Settings settings;

    public GameFunctions(Settings settings){
        this.settings = settings;
    }


    public void EasyGameMode(){
        System.out.println("Easy");




    }

    public void MediumGameMode() {
        System.out.println("Medium");

        settings.MasterChoiceOne = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceTwo = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceThree = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceFour = ThreadLocalRandom.current().nextInt(1, 6);

        List<Integer> MasterChooses = new ArrayList<>();
        MasterChooses.add(settings.MasterChoiceOne);
        MasterChooses.add(settings.MasterChoiceTwo);
        MasterChooses.add(settings.MasterChoiceThree);
        MasterChooses.add(settings.MasterChoiceFour);

        do {
            if (settings.isEvaluated()) {
                int countColorsAtWrongPlace = 0;
                int rightPlace = 0;

                System.out.println(settings.isEvaluated());

                        for (int i = 0; i < 4; i++) {


                            System.out.println("User: " + MasterColor(settings.UserChoices.get(i)));

                            if (settings.UserChoices.contains(MasterChooses.get(i))) {
                                if (settings.UserChoices.get(i).equals(MasterChooses.get(i))) {

                                    if (settings.UserChoices.equals(MasterChooses)){
                                        System.out.println("Game won!!!");
                                        settings.setGameWon(true);
                                    }
                                    rightPlace++;
                                }
                                countColorsAtWrongPlace++;

                            }

                        }
                        countColorsAtWrongPlace = countColorsAtWrongPlace - rightPlace;
                        System.out.println("You had " + countColorsAtWrongPlace +
                                " right color(s), but at wrong place and " +
                                rightPlace + " color(s) at the right place!" );
                        settings.UserChoices.clear();
                        settings.setEvaluated(false);
                        settings.setTries(settings.getTries() + 1);

            }
           // System.out.println(settings.getTries());
        } while(settings.getTries() <= settings.getMaxTries());
        System.out.println("You lost, sorry!");

        for (int i = 0; i < 4; i++) {
        System.out.println("Computer: " + MasterColor(MasterChooses.get(i)));
        }

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
