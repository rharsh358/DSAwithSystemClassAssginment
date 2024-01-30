package tutort.arrays.assginment1;
import java.util.Scanner;

//Find min of 3 elements

public class MinElement {

    static void findMinNumber(int x, int y, int z){

        if (x < y && x < z){
            System.out.println("Minimum Number: "+x);
        } else if (y < z) {
            System.out.println("Minimum Number: "+y);
        } else {
            System.out.println("Minimum Number: "+z);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secNum = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int thirdNum=  sc.nextInt();
        System.out.println("*****************######**************");
        findMinNumber(firstNum,secNum,thirdNum);
    }
}
