package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        //assumptions:
        // 1) the start and end values may be included in the sum
        // 2) the start value can either be larger OR smaller than the end value

        //switch start and end if start is greater
        int temp;
        if (start > end) {
            temp = start;
            start = end;
            end = temp;
        }

        //set start and end to their closest odd number that's also between the 2 numbers
        //eg if start = 1 and end = 100, start will stay 1 and end will become 99

        if ((start % 2) == 0)//check if even
            start += 1;
        if ((end % 2) == 0)
            end -= 1;

        //using a formula to calculate the sum of numbers with constant spacing
        //essentially, (top + bottom)*height/2, or area of a trapezoid
        int numOfNums;
        int sum = -1;
        numOfNums = ((end - start)/2) + 1; //find out how may odd numbers there are
        sum = (start + end)*numOfNums/2;

        return sum;
    }
}
