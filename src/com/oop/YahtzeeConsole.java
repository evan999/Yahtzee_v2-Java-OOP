package com.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YahtzeeConsole extends Console {

    static public void startGame(){
        startGame("Yahtzee");
    }

    static public void displayHand(List<Die> dice){
        System.out.println("----------");
        for (var die : dice){
            System.out.print(die.getValue() + " ");
        }
        System.out.print("\n----------\n");
    }

    static public int getUserSelection(){
        System.out.println("Enter die to reroll (1-5) Ex: 1 ");
        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput) - 1;
    }

    static public List<Integer> getUserChoices(){
        System.out.println("Select dice to reroll (1-5) Ex: 1 2 5");
        String userInput = scanner.nextLine();
        String[] inputArray = userInput.split(" ");
        List<Integer> selectedDice = new ArrayList<>();
        for (String selection : inputArray){
            selectedDice.add(Integer.parseInt(selection) - 1);
        }
        return selectedDice;
    }
}
