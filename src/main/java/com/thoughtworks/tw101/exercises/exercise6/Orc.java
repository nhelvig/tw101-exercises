package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by nhelvig on 8/27/15.
 */
public class Orc implements Monster {
    int hitpoints;

    public Orc() {
        this.hitpoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        this.hitpoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.print("Orc ");
        System.out.println(this.hitpoints);
    }
}
