package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("How many numbers to display in the loops?");

            if (scanner.hasNextInt()) {
                int loopCount = scanner.nextInt();

                System.out.println("\nExecuting loop for " + loopCount + " iterations:");
                displayNumbers(loopCount);
            } else {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static void displayNumbers(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("i = " + i);
        }
    }
}