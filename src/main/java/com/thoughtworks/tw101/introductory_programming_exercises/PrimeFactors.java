package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        System.out.print(primeFactors);
    }

    private static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        int maxCheckedNum = (int) Math.sqrt(n);

        for (int divisor = 2; divisor <= maxCheckedNum; divisor++) {
            if (isDivisible(n, divisor))
                if (isPrime(divisor))
                    factors.add(divisor);
        }
        //have to check to see if number itself is prime
        //because the optimization with maxCheckedNum removed the number it self
        if (isPrime(n))
            factors.add(n);

        return factors;
    }

    //this code is adapted from the pseudo-code from https://en.wikipedia.org/wiki/Primality_test
    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        else if (num <= 3)
            return true;
        else if (isDivisible(num,2) || isDivisible(num,3))
            return false;

        int testNum = 5;
        while (testNum*testNum <= num) {
            if (isDivisible(num,testNum) || isDivisible(num,testNum+2))
                return false;
            testNum += 6;
        }
        return true;
    }

    private static boolean isDivisible(int n, int divisor) {
        if (n%divisor == 0)
            return true;
        return false;
    }
}
