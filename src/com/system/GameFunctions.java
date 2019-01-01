package com.system;

import com.system.settings.Settings;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameFunctions {

    private Settings settings;

    public GameFunctions(Settings settings){
        this.settings = settings;
    }


    public void EasyGameMode(){
        System.out.println("Easy");
        List<Integer> MasterChooses = Arrays.asList(1, 2, 3, 4, 5, 6);
        Collections.shuffle(MasterChooses);


        RunGame(MasterChooses.subList(0, 4));

    }

    public void MediumGameMode() {
        System.out.println("Normal");

        settings.MasterChoiceOne = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceTwo = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceThree = ThreadLocalRandom.current().nextInt(1, 6);
        settings.MasterChoiceFour = ThreadLocalRandom.current().nextInt(1, 6);

        List<Integer> MasterChooses = new ArrayList<>();
        MasterChooses.add(settings.MasterChoiceOne);
        MasterChooses.add(settings.MasterChoiceTwo);
        MasterChooses.add(settings.MasterChoiceThree);
        MasterChooses.add(settings.MasterChoiceFour);

        RunGame(MasterChooses);


    }

    public void HardGameMode(){
        System.out.println("Hard");

        List<Integer> MasterChooses = Arrays.asList(1, 2, 3, 4, 5, 6);
        Collections.shuffle(MasterChooses);

        RunGame(MasterChooses);

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

        for (int i = 0; i < settings.getColorCounts(); i++) {
            System.out.println("Computer: " + MasterColor(MasterChooses.get(i)));
        }
    }
}
