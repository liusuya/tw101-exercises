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

    private boolean getAndCheckGuess(){
        int guess = listener.getNextInt();
        guesses.add(guess); //do we want to only save the numbers that are within 1-100?
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
            win = true;
        } else {
            System.out.println("Please enter a whole number between 1 and 100 inclusive.");
        }

        return win;
    }

    public void playGame() {

        boolean win = false;

        System.out.println("Please guess a whole number between 1 and 100 inclusive.");
        while (!win) {
            win = getAndCheckGuess();
        }
        System.out.println("You guessed the following numbers:");
        for (int guess:guesses) {
            System.out.print(guess + " ");
        }
        System.out.println("\nYou Win! \n");

    }
}
