package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchExpressions {
    /*
    Task 1. Create a program to display the "text mark" corresponding to a certain "numerical mark", using the following equivalence:
    9,10 = Well
    7,8 = Good
    6 = Acceptable
    5 = Bad
    0-4 = Very Bad
    Your program must ask the user for a numerical mark and display the corresponding text mark.
    You must do it using "Switch Expressions".
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter numerical mark:");
        try {
            int numericMark = scanner.nextInt();
            String mark = switch (numericMark) {
                case 0, 1, 2, 3, 4 -> "Very Bad";
                case 5 -> "Bad";
                case 6 -> "Acceptable";
                case 7, 8 -> "Good";
                case 9, 10 -> "Well";
                default -> throw new IllegalStateException("Unexpected value: " + numericMark);
            };
            System.out.println(mark);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
