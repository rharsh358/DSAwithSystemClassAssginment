package veenit.dsa;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {

        int num, rem, revNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Positive Number :- ");
        num = sc.nextInt();
        int number = num;


        while (num >= 1) {
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;


        }


        if (number == revNum) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }


    }
}
