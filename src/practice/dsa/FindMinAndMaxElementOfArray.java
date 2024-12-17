package practice.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinAndMaxElementOfArray {

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
        // arrTwoPassMethod(array, size);
        arrOnePassMethod(array, size);
    }


    // Brute force method
    // Complexity O(NLogN)
    static void arrBruitForceMethod(int array[], int n) {
        Arrays.sort(array);
        int min = array[0];
        int max = array[n - 1];
        System.out.println("Minimum Element :" + min + "    Maximum Element :" + max);
    }

    // Complexity O(N) + O(N)
    static void arrTwoPassMethod(int array[], int n) {
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < n; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i = 0; i < n; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum Element :" + min + "    Maximum Element :" + max);

    }


    // Complexity O(N)
    static void arrOnePassMethod(int array[], int n) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < n; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Minimum Element :" + min + "    Maximum Element :" + max);

    }

    static void arrPrint(int array[], int n) {
        System.out.println("Element of Array");
        for (int element : array) {
            System.out.print("  " + element);
        }
        System.out.println();
    }


}
