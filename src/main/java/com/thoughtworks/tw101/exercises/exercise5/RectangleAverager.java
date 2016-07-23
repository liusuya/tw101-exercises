package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        float numRec = 0;
        float totalArea = 0;
        for (Rectangle rec : rectangles) {
            numRec++;
            totalArea += rec.area();
        }
        return totalArea/numRec;
    }

}
