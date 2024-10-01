package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public void play (){
        Random random = new Random();
        int theRandomNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100.");
        int numberOfGuesses = 0;
        int maxNumberOfGuesses = 5;

//        Uncomment the following line to see the random number.
//        System.out.println("Random number = " + theRandomNumber);

        while (numberOfGuesses < maxNumberOfGuesses) {
            int userInput = Integer.parseInt(scanner.nextLine());
            if (userInput < 1 || userInput > 100) {
                System.out.println("Invalid guess, try again: ");
                continue;
            }
            if (userInput == theRandomNumber) {
                System.out.println("You win Great job!!");
                break;
            } else {
                if (userInput > theRandomNumber) {
                    System.out.println("Too high! try again: ");
                } else {
                    System.out.println("Too low! try higher: ");
                }
                numberOfGuesses++;
            }

            if (numberOfGuesses == maxNumberOfGuesses) {
                System.out.println("You lose! Winning number was: " + theRandomNumber);
            }
        }
    }
}
