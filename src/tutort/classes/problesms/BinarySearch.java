package tutort.classes.problesms;

import java.util.Scanner;

public class BinarySearch {

     static int binarySearchIterative(int[] arr, int searchEle) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == searchEle) {
                return mid; // Target found
            } else if (arr[mid] < searchEle) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    static void prinArray(int arr[]){
        System.out.print("Result array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element of Array:" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Search Element of the array: ");
        int target = sc.nextInt();

        prinArray(arr);
        int result = binarySearchIterative(arr, target);
        System.out.println("\nIterative Binary Search:");
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }


    }
}
