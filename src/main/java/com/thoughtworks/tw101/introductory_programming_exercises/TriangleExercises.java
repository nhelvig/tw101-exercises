package com.thoughtworks.tw101.introductory_programming_exercises;

public class TriangleExercises {
    public static void main(String[] args) {
        //The functions all work as intended on their own. However, if you combine them they
        //will overlap because I used print() instead of println(). I did not want to add in
        //extra println() lines because then the functions would not work independently.
        drawAnAsterisk();
        drawAHorizontalLine(8);
        drawAVerticalLine(3);
        drawARightTriangle(3);
    }

//    Easiest exercise ever
//    Print one asterisk to the console.
//    Example: *
    private static void drawAnAsterisk() {
        System.out.print("*");
    }

//    Draw a horizontal line
//    Given a number n, print n asterisks on one line.
//    Example when n=8:  ********
    private static void drawAHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            drawAnAsterisk();
        }
    }

//    Draw a vertical line
//    Given a number n, print n lines, each with one asterisks
//    Example when n=3:
//            *
//            *
//            *
    private static void drawAVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            drawAnAsterisk();
            System.out.println();
        }
    }

//    Draw a right triangle
//    Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
//    Example when n=3:
//            *
//            **
//            ***
    private static void drawARightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int x = i; x > 0; x--) {
                drawAnAsterisk();
            }
            System.out.println();
        }
    }
}
