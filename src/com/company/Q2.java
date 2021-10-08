package com.company;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int maxNumber = 0;
        int guess = 0;
        int numberOfGuesses = 0;

        do {
            System.out.println("Enter the top limit. Min is 1, Max is 1000");
            maxNumber = input.nextInt();

            if (maxNumber < 1 || maxNumber > 1000) {
                System.out.println("Not a valid number, please enter another number: ");
            }

        } while (maxNumber < 1 || maxNumber > 1000);

        int numberToGuess = random.nextInt(maxNumber);
        numberToGuess += 1;

        do {
            System.out.println("Have a guess: ");
            guess = input.nextInt();

            numberOfGuesses += 1;
        } while (guess != numberToGuess && numberOfGuesses < 5);

        if (guess == numberToGuess) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

        System.out.println("The random number was: " + numberToGuess);


    }
}
