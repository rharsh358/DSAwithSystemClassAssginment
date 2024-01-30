package tutort.arrays.assginment1;
import java.util.Scanner;

/*Find sum of array elements
[1,2,6,3,5] should return => 17
*/

public class sumOfArray {
    static int sumOfElement(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
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
        int sumOfArray = sumOfElement(arr);
        System.out.println("Result: " + sumOfArray);
    }
}
