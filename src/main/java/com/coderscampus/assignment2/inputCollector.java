package com.coderscampus.assignment2;

import java.util.Scanner;

public class inputCollector {

    public static Integer collectGuess(Scanner scanner, String gameMessage){
        System.out.println(gameMessage);
        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput);

    }
}
