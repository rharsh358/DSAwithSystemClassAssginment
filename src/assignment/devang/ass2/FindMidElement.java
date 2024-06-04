package assignment.devang.ass2;

//3. Find mid elements out of 3 elements.
public class FindMidElement {

    static int findMidElement(int a, int b, int c) {

        int midElement;
        midElement = (a > b)
                ? ((a < c) ? a : (b > c ? b : c))
                : ((b < c) ? b : (a > c ? a : c));

       /* if ((a > b && a < c) || (a > c && a < b)) {
            midElement = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            midElement = b;
        } else {
            midElement = c;
        }*/

        return midElement;
    }

    public static void main(String[] args) {

        int midNumber = findMidElement(40, 10, 10);
        System.out.println(midNumber);

    }
}
