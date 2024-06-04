package assignment.devang.ass2;

// 1. Find max of 3 elements

import static java.lang.Integer.MAX_VALUE;

public class MaxOfThreeElement {

    static int maximumOfThreeNumber(int a, int b, int c) {

        int maxValue = MAX_VALUE;

        // 3rd way
        int result = (a >= b && a >= c) ? a : (b >= c && b >= a) ? b : c;
        maxValue = result;
        return maxValue;
    }

    public static void main(String[] args) {

        int maxValueOfThree = maximumOfThreeNumber(05, 15, 10);
        System.out.println(maxValueOfThree);


    }
}
