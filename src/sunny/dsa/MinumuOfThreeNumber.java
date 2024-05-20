package sunny.dsa;

public class MinumuOfThreeNumber {

    public static void main(String[] args) {

        int a, b, c;
        a = 9;
        b = 6;
        c = 4;
        if (a < b && a < c) {
            System.out.println(a + " : small number");
        } else if (b < c) {
            System.out.println(b + " : small number");
        } else {
            System.out.println(c + " : small number");
        }
    }
}
