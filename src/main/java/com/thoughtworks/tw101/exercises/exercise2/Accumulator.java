package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    int incInstances = 0;

    public void incremement() {
        incInstances++;
    }

    public void total() {
        System.out.println("The increment method was called " + incInstances + " times.");
    }
}
