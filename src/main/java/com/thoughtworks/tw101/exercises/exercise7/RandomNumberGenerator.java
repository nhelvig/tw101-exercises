package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Random;

/**
 * Created by nhelvig on 8/28/15.
 */
public class RandomNumberGenerator {

    private int randomNumber;

    public void generateRandomNumber() {
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(100);
    }

    public boolean checkGuess(int guess) {
        if (guess == randomNumber) {
            System.out.println("You win!");
            return true;
        } else if (randomNumber < guess) {
            System.out.println("Too high! Guess again.");
            return false;
        } else {
            System.out.println("Too low! Guess again.");
            return false;
        }
    }
}
