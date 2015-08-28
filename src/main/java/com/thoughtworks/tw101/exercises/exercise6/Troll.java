package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by nhelvig on 8/27/15.
 */
public class Troll implements Monster{
    int hitpoints;

    public Troll() {
        this.hitpoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        this.hitpoints -= amount/2;
    }

    @Override
    public void reportStatus() {
        System.out.print("Troll ");
        System.out.println(this.hitpoints);
    }
}

