package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Suya on 2016-07-26.
 */
public class Troll implements Monster {
    private int hitDamage;
    private static String name = "Troll";

    public Troll (int amount) {
        hitDamage = amount;
    }
    public void takeDamage (int amount) {

        hitDamage -= (amount/2);

        if ( hitDamage < 0)
            hitDamage = 0;
    }

    public void reportStatus() {
        System.out.println(name + " " + hitDamage);
    }
}
