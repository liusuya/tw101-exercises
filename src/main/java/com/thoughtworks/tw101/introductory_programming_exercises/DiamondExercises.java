package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        for (int row = 1; row <= n; row++){
            drawCenteredRow(n, row);
        }
    }

    //the shift will move the entire triangle shift spaces to the right
    private static void drawAShiftedIsoscelesTriangle(int n, int shift) {

        for (int row = 1; row <= n; row++){
            drawChars(' ', shift);
            drawCenteredRow(n, row);
        }
    }

    //the shift will move the entire triangle shift spaces to the right
    private static void drawAShiftedUpsidedownIsosceleseTriangle(int n, int shift) {
        for (int row = n; row > 0; row--) {
            drawChars(' ', shift);
            drawCenteredRow(n, row);
        }
    }

    private static void drawCenteredRow(int n, int row) {
        //print the leading spaces
        for (int col = 1; col <= n-row; col++){
            drawChar(' ');
        }
        //print the stars
        for (int col = 1; col <= numStars(row); col++){
            drawChar('*');
        }
        drawChar('\n');
    }

    private static int numStars(int row) {
        return row*2 - 1;
    }

    private static void drawChars(char character, int numChars) {
        for (int i = 0; i < numChars; i++)
            drawChar(character);
    }

    private static void drawChar(char character){
        System.out.print(character);
    }


//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {

        drawAnIsoscelesTriangle(n);
        drawAShiftedUpsidedownIsosceleseTriangle(n-1,1);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawAShiftedIsoscelesTriangle(n-1, 1);
        System.out.println("Suya");
        drawAShiftedUpsidedownIsosceleseTriangle(n-1, 1);
    }
}
