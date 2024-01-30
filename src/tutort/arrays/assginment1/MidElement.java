package tutort.arrays.assginment1;
import java.util.Scanner;

//Find mid elements out of 3 elements.

public class MidElement {

    static int  findMidElement(int arr[]){

        if (arr == null || arr.length == 0) {
            return -1;
        }
        int middleIndex = arr.length / 2;
        return arr[middleIndex];
    }

    /*static int findMiddleElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int slow = 0;
        int fast = 0;

        while (fast < arr.length && arr[fast] != 0) {
            slow++;  // slow = slow.next

            if (fast + 1 < arr.length && arr[fast + 1] != 0) {
                fast = fast + 2; // fast = fast.next.next
            } else {
                break;
            }
        }
        return arr[slow - 1];
    }*/

    static void prinArray(int arr[]){
        System.out.print("Entered array: ");
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
        prinArray(arr);
        int mid = findMidElement(arr);
       // int mid = findMiddleElement(arr);
        System.out.println("Mid Element: "+mid);
    }
}
