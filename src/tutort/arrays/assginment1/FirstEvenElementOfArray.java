package tutort.arrays.assginment1;
import java.util.Scanner;

/*find first even number in array if there is no even return -1
[1,2,6,3,5] => should return 2
[1,7,9,3,5] => should return -1
[1,7,4,8,5] => should return 4
*/

public class FirstEvenElementOfArray {
    static int findFirstEven(int[] arr) {
        for (int element : arr) {
            if (element % 2 == 0) {
                return element;
            }
        }
        return -1; // Return -1 if no even number is found
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
        prinArray(arr);
        int result = findFirstEven(arr);
        System.out.println("Result: " + result);
    }
}
