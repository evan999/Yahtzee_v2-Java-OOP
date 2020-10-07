package com.oop;

import java.util.Random;

public class Die {
    private int value;
    private int sides = 6;

    public Die(){
        value = 1;
    }

    public void roll(Random random){
        value = random.nextInt(sides) + 1;
    }

    public int getValue(){
        return value;
    }

}
