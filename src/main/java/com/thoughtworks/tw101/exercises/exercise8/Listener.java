package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by Suya on 2016-07-30.
 */
public class Listener {
    private Scanner reader;
    private String input;

    public Listener() {
        reader = new Scanner(System.in);
    }

    public int getNextInt() {

        boolean formatValid = false;
        int number = -1;
        while (!formatValid) {
            try {
                input = reader.next();
                number = Integer.parseInt(input);
                formatValid = true;
            }
            catch(NumberFormatException e) {
                System.out.println("Please enter an integer number.");
            }
        }
        return number;
    }
}
