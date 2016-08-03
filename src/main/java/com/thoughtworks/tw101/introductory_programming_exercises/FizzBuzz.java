package com.thoughtworks.tw101.introductory_programming_exercises;

//FizzBuzz Exercise
//        FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to
//        certain rules.
//
//        Create a fizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//        Instead of numbers divisible by five print "Buzz".
//        Instead of numbers divisible by three and five print "FizzBuzz".
//
//        Sample Output:
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        int number = 1;
        boolean passedATest = false;

        for (; number <= 100; number++) {
            if (fizzTest(number)) {
                System.out.print("Fizz");
                passedATest = true;
            }
            if (buzzTest(number)) {
                System.out.print("Buzz");
                passedATest = true;
            }
            if (!passedATest)
                System.out.print(number);

            System.out.print("\n");
            passedATest = false;
        }

    }

    private static boolean fizzTest(int num) {
        if (num%3 == 0)
            return true;
        return false;
    }

    private static boolean buzzTest(int num) {
        if (num%5 == 0)
            return true;
        return false;
    }
}
