package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Suya on 2016-07-26.
 */
public class Orc implements Monster {

    private int hitDamage;
    private static String name = "Orc";

    public Orc (int amount) {
        hitDamage = amount;
    }
    public void takeDamage (int amount) {

        hitDamage -= amount;

        if ( hitDamage < 0)
            hitDamage = 0;
    }

    public void reportStatus() {
        System.out.println(name + " " + hitDamage);
    }

}
