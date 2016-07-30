package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_extra {

    public static void main_extra(String[] args) {

        boolean startNewGame = true;
        while (startNewGame) {
            try {
                Scanner reader = new Scanner(System.in);

                startNewGame = askToStartNewGame(reader);

                if (startNewGame)
                    playGuessingGame(reader);

            } catch (InputMismatchException e) {
                System.out.println("You have entered an invalid response. Game ended prematurely. \n");
            }
        }
        System.out.println("Exiting Game...");

    }

    private static void playGuessingGame(Scanner reader) {

        GuessingGame game = new GuessingGame();

        game.playGame(reader);

    }

    private static boolean askToStartNewGame(Scanner reader) {

        String input;
        System.out.println("Would you like to begin a new game?");

        while (true) {
            System.out.println("Please enter 'y' for yes and 'n' for no.");
            input = reader.next().toLowerCase();

            switch (input) {
                case "y":
                    return true;
                case "n":
                    return false;
                default: System.out.println("Input invalid. Please try again.");
            }
        }
    }


}
