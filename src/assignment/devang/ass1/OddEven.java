package assignment.devang.ass1;

import java.util.Scanner;

//5. check number is odd or not, print odd or even

public class OddEven {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number :- ");
        num = sc.nextInt();

        System.out.println(num % 2 == 0 ? "Even Number" : "Odd Number");

        /*if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");*/
    }
}
