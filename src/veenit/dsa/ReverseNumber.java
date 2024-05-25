package veenit.dsa;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int num, rem, revNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Positive Number :- ");
        num = sc.nextInt();

        while (num >= 1) {
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;


        }
        //  String formattedNumber = String.format("%03d", revNum);
        System.out.println("Reverse Number is : " + revNum);
    }
}
