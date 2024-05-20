package sunny.dsa;

public class MiddleNumber {

    public static void main(String[] args) {

        int a, b, c;
        a = 9;
        b = 6;
        c = 4;
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println(a + " : middle number");
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b + " : middle number");
        } else {
            System.out.println(c + " : middle number");
        }
    }
}
