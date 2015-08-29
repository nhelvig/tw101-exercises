package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nhelvig on 8/28/15.
 */
public class Player {

    int guess;

    public int guess() throws IOException {
        boolean haveValidGuess = false;
        while (!haveValidGuess) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Make your guess: ");
                String guessString = br.readLine();
                guess = Integer.parseInt(guessString);
                haveValidGuess = true;
            } catch (NumberFormatException e) {
                System.out.println("Sorry, that is not a valid guess. Please use an integer.");
            }
        }

        return guess;
    }
}
