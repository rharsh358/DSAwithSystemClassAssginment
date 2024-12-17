package practice.dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ReverseArray {

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
        System.out.println("Print Array");
        arrPrint(array);

        /*System.out.println("Reverse Array");
         reverArray(array, size);*/

        //twoPointerApproach(array, size);
        OneTraversalTillHalf(array, size);

        //for in build method of java
        Integer[] array1 = {10, 20, 30, 40, 50};
        //revereByInbuildMethod(array1);
    }

    // Complexity  : O(N)
    static void reverArray(int array[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    // Complexity  : O(N)
    static void revereByInbuildMethod(Integer[] array1) {

        List<Integer> list = Arrays.asList(array1);
        Collections.reverse(list);
        Integer[] reversedArray = list.toArray(new Integer[0]);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }


    static void arrPrint(int array[]) {

        for (int element : array) {
            System.out.print(" " + element);
        }
        System.out.println();
    }


    // Using Two Pointer Approach (Recommend)
    // Complexity  : O(N/2)

    static void twoPointerApproach(int array[], int n) {

        int start = 0;
        int end = n - 1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }


    // Using One traversal till the half approach (Recommend)
    // Complexity  : O(N/2)
    static void OneTraversalTillHalf(int array[], int n) {

        for (int i = 0; i < n / 2; i++) {
            swap(array, i, n - i - 1);
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }


    // using temp variable
    public static void swap1(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    // using inplace variable (Recommend)
    public static void swap(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
