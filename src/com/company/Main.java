package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        String newWord = "";
        String userWordGuess = "";

        System.out.println("The new word: ");
        newWord = input.next();

        System.out.println("Your guess: ");
        userWordGuess = input.next();

        if (newWord.equals(userWordGuess)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
