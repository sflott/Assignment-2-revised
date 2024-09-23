package com.coderscampus.assignment2;
import java.util.Random;
import java.util.Scanner;
public class guessingGameApplication {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100.");
        String userInput = scanner.nextLine();
        int convertedInput = Integer.parseInt(userInput);
        int randomNum = random.nextInt(100) + 1 ;
        System.out.println("Random number = " + randomNum);
        int i = 0;
        while (i<4) {
            if (convertedInput == randomNum) {
                System.out.println("You win Great job!!");
                break;
            } else if (convertedInput < 1 || convertedInput > 100) {
                convertedInput = inputCollector.collectGuess(scanner,  "Invalid guess, no chances used try again: ");
                continue;
            } else if (convertedInput > randomNum) {
                convertedInput = inputCollector.collectGuess(scanner,convertedInput + " is to high try again: ");
                i++;
            } else if (convertedInput < randomNum) {
                convertedInput = inputCollector.collectGuess(scanner, convertedInput + " is to low try higher");
                i++;
            }
            if (i == 4){
                System.out.println("You lose! Winning number was: " + randomNum);
            }
        }

            }
        }
    


