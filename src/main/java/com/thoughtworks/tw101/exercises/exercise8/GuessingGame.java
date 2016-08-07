package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

/**
 * Created by Suya on 2016-07-30.
 */
public class GuessingGame {

    private int answer;
    private Listener listener;
    private ArrayList<Integer> guesses;
    private static final int MAX_GUESS_NUM = 100;
    private static final int MIN_GUESS_NUM = 1;

    public GuessingGame() {
        System.out.println("Starting a new Guessing Game.");
        listener = new Listener();
        answer = (int) (Math.random()*100 + 1);
        guesses = new ArrayList<Integer>();
    }

    private int getGuess() {
        int guess = listener.getNextInt();
        guesses.add(guess);
        return guess;
    }

    private boolean checkGuess(int guess){

        boolean win = false;

        if (guess > answer) {
            System.out.println("Your answer is too high.");
        } else if (guess < answer) {
            System.out.println("Your answer is too low.");
        } else if (guess == answer) {
            System.out.println("You have guessed the right answer!");
            win = true;
        } else {
            System.out.println("Please enter a whole number between 1 and 100 inclusive.");
        }

        return win;
    }

    private void printGuesses() {
        System.out.println("You guessed the following numbers:");
        for (int currGuess:guesses) {
            System.out.print(currGuess + " ");
        }
    }

    public void playGame() {

        boolean win = false;
        int guess;

        System.out.println("Please guess a whole number between 1 and 100 inclusive.");
        while (!win) {
            guess = getGuess();
            win = checkGuess(guess);
        }
        printGuesses();
        System.out.println("\nYou Win! \n");

    }
}
