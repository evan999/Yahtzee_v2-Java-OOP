package com.oop;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        YahtzeeConsole.startGame();
        Hand hand = new Hand(5);
        hand.rollDice(random);
        //YahtzeeConsole.displayHand(hand.getDiceValues());
        YahtzeeConsole.displayHand(hand.getDice());
        List<Integer> userChoices = YahtzeeConsole.getUserChoices();
        hand.rollDice(random, userChoices);
        YahtzeeConsole.displayHand(hand.getDice());

    }
}
