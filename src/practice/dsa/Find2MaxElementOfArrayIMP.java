package practice.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Find2MaxElementOfArrayIMP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < array.length; i++) { // Using arr.length here
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        arrPrint(array, size);
        //arrBruitForceMethod(array, size);
        //arrTwoPassMethod(array, size);
        arrOnePassMethod(array, size);
    }


    // Brute force method
    // Complexity O(NLogN)
    static void arrBruitForceMethod(int array[], int n) {

        if (array.length < 2) {
            System.out.println("Invalid Input");
        } else {
            Arrays.sort(array);
            int firstMax = array[n - 1];
            int secondMax = array[n - 2];
            System.out.println("Max Element :" + firstMax + "    Second Max Element :" + secondMax);
        }

    }

    // Complexity O(N) + O(N)
    static void arrTwoPassMethod(int array[], int n) {
        int secondMax = Integer.MIN_VALUE;
        int max = array[0];
        int tempMax = Integer.MIN_VALUE;
        if (array.length < 2) {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = 0; i < n; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i = 0; i < n; i++) {   //4 1

            if (array[i] > tempMax) {
                secondMax = tempMax;
                tempMax = array[i];

            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }


        System.out.println("Max Element :" + max + "    Second Max Element :" + secondMax);

    }


    // Complexity O(N)
    static void arrOnePassMethod(int array[], int n) {
        int secondMax = Integer.MIN_VALUE;
        int tempMax = Integer.MIN_VALUE;
        if (array.length < 2) {
            System.out.println("Invalid Input");
            return;
        }
        for (int i = 0; i < n; i++) {   //4 1

            if (array[i] > tempMax) {
                secondMax = tempMax;
                tempMax = array[i];

            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }


        System.out.println("Max Element :" + tempMax + "    Second Max Element :" + secondMax);

    }

    static void arrPrint(int array[], int n) {
        System.out.println("Element of Array");
        for (int element : array) {
            System.out.print("  " + element);
        }
        System.out.println();
    }


}


// -2, 1,10,15
// -2, 1,10,15, 15
//2 13 15 17 9 5 12 8 16 19 18 18
// 4 1
// 1 1
//1
