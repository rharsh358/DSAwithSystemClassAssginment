package assignment.devang.ass2;

import static java.lang.Integer.MIN_VALUE;

//2. Find min of 3 elements

public class MinOfThreeElement {

    static int minimumOfThreeNumber(int a, int b, int c) {

        int minValue = MIN_VALUE;

        // 3rd way
        int result = (a <= b && a <= c) ? a : (b <= c && b <= a) ? b : c;
        minValue = result;
        return minValue;
    }

    public static void main(String[] args) {

        int minValueOfThree = minimumOfThreeNumber(8, 9, 7);
        System.out.println(minValueOfThree);


    }

}
