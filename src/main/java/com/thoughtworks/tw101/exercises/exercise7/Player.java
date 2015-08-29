package com.thoughtworks.tw101.exercises.exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nhelvig on 8/28/15.
 */
public class Player {

    public int guess() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Make your guess: ");
        String guessString = br.readLine();
        int guess = Integer.parseInt(guessString);
        return guess;
    }
}
