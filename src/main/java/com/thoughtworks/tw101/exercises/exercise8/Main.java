package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Player player = new Player();
        RandomNumberGenerator game = new RandomNumberGenerator();

        game.generateRandomNumber();
        while (game.checkGuess(player.guess()) == false) {
            //It continues to ask.
        }
        System.exit(0);
    }
}
