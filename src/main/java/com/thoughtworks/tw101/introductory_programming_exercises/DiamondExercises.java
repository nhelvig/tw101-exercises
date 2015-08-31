package com.thoughtworks.tw101.introductory_programming_exercises;

import java.util.ArrayList;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        for (int total = 0; total < n; total++) {
            String spaces = "";
            String stars = "";
            for (int i = total; i < n - 1; i++) {
                spaces += " ";
            }
            for (int star = 0; star < (total * 2) + 1; star++) {
                stars += "*";
            }
            String finalLine = spaces + stars + spaces;
            System.out.println(finalLine);
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        ArrayList<String> rows = new ArrayList(n);
        for (int total = 0; total < n; total++) {
            String spaces = "";
            String stars = "";
            for (int i = total; i < n - 1; i++) {
                spaces += " ";
            }
            for (int star = 0; star < (total * 2) + 1; star++) {
                stars += "*";
            }
            String finalLine = spaces + stars + spaces;
            rows.add(total, finalLine);
        }
        for (String row : rows) {
            System.out.println(row);
        }
        for (int i = rows.size() - 2; i >= 0; i--) {
            System.out.println(rows.get(i));
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        ArrayList<String> rows = new ArrayList(n);
        for (int total = 0; total < n; total++) {
            String spaces = "";
            String stars = "";
            for (int space = total; space < n - 1; space++) {
                spaces += " ";
            }
            for (int star = 0; star < (total * 2) + 1; star++) {
                stars += "*";
            }
            String finalLine = spaces + stars + spaces;
            rows.add(total, finalLine);
        }
        for (int i = 0; i < rows.size() - 1; i++) {
            System.out.println(rows.get(i));
        }
        System.out.println("Nicolas");
        for (int i = rows.size() - 2; i >= 0; i--) {
            System.out.println(rows.get(i));
        }
    }
}
