package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            playGuessingGame();

    }

    private static void playGuessingGame() {

        try {

            Scanner reader = new Scanner(System.in);
            GuessingGame game = new GuessingGame();

            game.playGame(reader);

        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid response. Game ended prematurely. \n");
        }

    }
}
