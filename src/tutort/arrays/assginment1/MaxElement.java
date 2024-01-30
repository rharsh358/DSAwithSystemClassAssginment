package tutort.arrays.assginment1;

import java.util.Scanner;

//Find max of 3 elements

public class MaxElement {

    static void maxNumber(int x, int y, int z){
        if (x > y && x > z){
            System.out.print("Max Element: "+x);
        } else if (y > z) {
            System.out.print("Max Element: "+y);
        } else {
            System.out.print("Max Element: "+z);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Element: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Element: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Element: ");
        int c = sc.nextInt();

        System.out.println("*****************######**************");
        maxNumber(a, b, c);

    }
}
