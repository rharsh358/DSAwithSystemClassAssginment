package practice.dsa;

import java.util.Scanner;

public class PrintPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of print pattern : ");
        int n = sc.nextInt();
        System.out.println("*******Decreasing Array**********");
        printDecreasingPattern(n);

        System.out.println();
        System.out.println("*******Increasing Array**********");

        printIncresinggPattern(n);

        System.out.println();
        System.out.println("*******Increasing Count Array**********");
        printIncreasingCountPattern(n);
    }


    static void printDecreasingPattern(int sizeOfPattern) {

        for (int i = 0; i < sizeOfPattern; i++) {
            for (int j = 0; j + i < sizeOfPattern; j++) {

                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void printIncresinggPattern(int sizeOfPattern) {

        for (int i = 0; i < sizeOfPattern; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(" *");
            }
            System.out.println();
        }
    }


    static void printIncreasingCountPattern(int sizeOfPattern) {
        int count = 0;

        for (int i = 0; i < sizeOfPattern; i++) {
            for (int j = 0; j <= i; j++) {
                ++count;
                System.out.print(" " + count);
            }
            System.out.println();
        }
    }

}
