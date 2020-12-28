package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TeeingCollectors {
    /* Task 2. Create a program to display the percent of unique numbers in the entered number set.
             E. g.:
             [1, 1] -> 50%
             [1, 2, 3, 4, 5] -> 100%
             [1, 2, 2, 3] -> 75%
     You must do it using "Teeing Collectors"*/
    public static void main(String[] args) {
        List<Integer> numbersSet = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter numbers: ");
        String line = scanner.next();
        String[] stringArray = line.split(",");
        for (String str : stringArray) {
            numbersSet.add(Integer.parseInt(str));
        }
        double resultPercentage = numbersSet
                .stream()
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.toSet(),
                        (q, set) -> (double) set.size() / (double) q * 100));
        System.out.println("Percent of unique numbers is " + resultPercentage);
    }
}
