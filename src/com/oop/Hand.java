package com.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Die> dice;

    public Hand(int numberOfDice){
        dice = new ArrayList<Die>();
        for(int die = 0; die < numberOfDice; die++){
            dice.add(new Die());
        }
    }

    public void rollDice(Random random){
        for (var die : dice){
            die.roll(random);
        }
    }

    public void rollDice(Random random, int selectedDie){
        dice.get(selectedDie).roll(random);
    }

    public void rollDice(Random random, List<Integer> selectedDice){
        for (int selectedDie : selectedDice){
            rollDice(random, selectedDie);
        }
    }

    public List<Die> getDice(){
        return dice;
    }

    /*
    public List<Integer> getDiceValues(){
        List<Integer> diceValues = new ArrayList<>();
        for(var die : dice){
            diceValues.add(die.getValue());
        }
        return diceValues;
    }
    */
}
