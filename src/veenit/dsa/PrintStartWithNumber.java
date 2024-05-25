package veenit.dsa;

import java.util.Scanner;

public class PrintStartWithNumber {

    public static void main(String[] args) {
        int n, counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter valid number you want to print pattern :- ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Number");
        } else {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i && counter <= n; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
            }
        }
    }
}








/*
output :
1
2 3
4 5 6
7 8 9 10

or user can send the request till which number we can print

*/
