package com.upg.program;
import java.util.Scanner;

public class MyNumberGuesser {

    public static void main(String[] args) {
        numberGuesser();
    }

    public static void numberGuesser() {
        Scanner scanner = new Scanner(System.in);
        int numberEntered;
        int numberToGuess = (int) (Math.random() * 100) + 1;
        System.out.println(numberToGuess);
        // int numberToGuess = 50;

        // Write your code here
        System.out.println("Welcome to the Mysterious Number Guesser!\n" +
                "I have selected a number between 1 and 100. Can you guess it?");
        while (true) {
            System.out.println("Enter your guess: ");
            if (scanner.hasNextInt()) {
                numberEntered = scanner.nextInt();
                if (numberEntered == numberToGuess) {
                    System.out.println("Congratulations! You guessed the mysterious number!");
                    break;
                } else if (numberEntered > numberToGuess + 10 || numberEntered < numberToGuess - 10) {
                    System.out.println("You're far away!\n");
                } else  {
                    System.out.println("You're getting close!");
                }
            } else {
                System.out.println("Error: Please enter a valid integer.");
            }

        }

    }


}
