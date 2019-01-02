package com.system;

import com.gui.MastermindGUI;
import com.system.settings.Settings;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameFunctions {

    private Settings settings;


    public GameFunctions(Settings settings ){

        this.settings = settings;
    }


    public void EasyGameMode(){
        System.out.println("Easy");
        settings.MasterChooses = Arrays.asList(1, 2, 3, 4, 5, 6);
        Collections.shuffle(settings.MasterChooses);


        RunGame(settings.MasterChooses.subList(0, 4));

    }

    public void MediumGameMode() {
        System.out.println("Normal");

        settings.MasterChoiceOne = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceTwo = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceThree = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceFour = ThreadLocalRandom.current().nextInt(1, 6);


        settings.MasterChooses.add(settings.MasterChoiceOne);
        settings.MasterChooses.add(settings.MasterChoiceTwo);
        settings.MasterChooses.add(settings.MasterChoiceThree);
        settings.MasterChooses.add(settings.MasterChoiceFour);

        RunGame(settings.MasterChooses);


    }

    public void HardGameMode(){
        System.out.println("Hard");

        settings.MasterChooses = Arrays.asList(1, 2, 3, 4, 5, 6);
        Collections.shuffle(settings.MasterChooses);

        RunGame(settings.MasterChooses);

    }

    public String MasterColor(int MasterChoice){

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

    private void RunGame(List<Integer> MasterChooses){
        do {
            if (settings.isEvaluated()) {
                int countColorsAtWrongPlace = 0;
                int rightPlace = 0;


                for (int i = 0; i < settings.getColorCounts(); i++) {

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
                countColorsAtWrongPlace -= rightPlace;

                if (countColorsAtWrongPlace > 0) {
                    System.out.println("You had " + countColorsAtWrongPlace +
                            " right color(s), but at wrong place and " +
                            rightPlace + " color(s) at the right place!");
                } else if (rightPlace > 0){
                    System.out.println("You had " + rightPlace + " color(s) at the right place!");
                } else {
                    System.out.println("You didnt had any right colors!");
                }

                settings.UserChoices.clear();
                settings.setEvaluated(false);
                settings.setTries(settings.getTries() + 1);
            }
            // System.out.println(settings.getTries());
        } while(settings.getTries() <= settings.getMaxTries());
        System.out.println("You lost, sorry!");
        settings.setGameLost(true);

        for (int i = 0; i < settings.getColorCounts(); i++) {
            System.out.println("Computer: " + MasterColor(MasterChooses.get(i)));

        }
        /**
        gui.label2.setText(MasterColor(MasterChooses.get(0)));
        gui.label2.setText(MasterColor(MasterChooses.get(1)));
        gui.label2.setText(MasterColor(MasterChooses.get(2)));
        gui.label2.setText(MasterColor(MasterChooses.get(3)));
        gui.refreshButtons();
         */
    }
}
