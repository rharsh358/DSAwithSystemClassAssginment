package assignment.devang.ass1;

import java.util.Scanner;

//4. check year is leap or not

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Year :- ");
        year = sc.nextInt();

        //int year = 1900;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " year is a leap year");
        } else {
            System.out.println(year + " year is not leap year");
        }
    }
}
