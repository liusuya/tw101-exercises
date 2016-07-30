package com.thoughtworks.tw101.exercises.exercise7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Suya on 2016-07-29.
 */
public class GuessingGame {

    private int answer;
    private Scanner reader;
    private static final int MAX_GUESS_NUM = 100;
    private static final int MIN_GUESS_NUM = 1;

    public GuessingGame() {
        System.out.println("Starting a new Guessing Game.");
        answer = (int) (Math.random()*100 + 1);
    }

    private boolean getAndCheckGuess(){
        int guess = reader.nextInt();
        boolean win = false;


        //make sure the number is within range
        if (guess > MAX_GUESS_NUM || guess < MIN_GUESS_NUM) {
            System.out.println("Number must be between 1 and 100. Please enter a valid number.");
            return win;
        }


        if (guess > answer) {
            System.out.println("Your answer is too high.");
        } else if (guess < answer) {
            System.out.println("Your answer is too low.");
        } else if (guess == answer) {
            System.out.println("You have guessed the right answer!");
            System.out.println("You Win!! \n");
            win = true;
        } else {
            System.out.println("Please enter a whole number between 1 and 100 inclusive.");
        }


        return win;
    }

    public void playGame(Scanner reader) {

        this.reader = reader;
        boolean win = false;

        System.out.println("Please guess a whole number between 1 and 100 inclusive.");
        while (!win) {
            win = getAndCheckGuess();
        }

    }

}
