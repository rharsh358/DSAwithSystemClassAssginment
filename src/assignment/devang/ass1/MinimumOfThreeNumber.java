package assignment.devang.ass1;

import static java.lang.Integer.MAX_VALUE;

//1. Minimum of three numbers
public class MinimumOfThreeNumber {
    public static void main(String[] args) {
        int result = minimumOfThreeNumber(15, 15, 20);
        System.out.println(result);
    }

    static int minimumOfThreeNumber(int a, int b, int c) {

        int res = MAX_VALUE;

        // 1st way
        /*if (a <= b && a <= c) {
            res = a;
        } else if (b <= c && c >= a) {
            res = b;
        } else {
             res = c;
        }*/

        // 2nd way
       /* int result = Math.min(a, Math.min(b, c));
        res = result;*/

        // 3rd way
        int result = (a <= b && a <= c) ? a : (b <= c && c >= a) ? b : c;
        res = result;
        return res;
    }
}
