package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int iSum = 0;
        int increment = 2;
        int iMax = 100;
        for (int num = 1; num < iMax; num+=increment) {
            System.out.println(num);
            iSum+=num;
        }
        System.out.println(iSum);

    }
}
