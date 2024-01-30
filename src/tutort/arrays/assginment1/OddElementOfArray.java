package tutort.arrays.assginment1;
import java.util.Arrays;
import java.util.Scanner;

/*Return all odd elements from array
[1,5,6,4,3,2,8] should return => [1,5,3]*/

public class OddElementOfArray {

    static int[] findOddElement(int[] arr) {

        int cntArray = 0;
        for (int element : arr) {
            if (element % 2 != 0) { // just counting the number of odd element in given array
                cntArray++;
            }
        }

        int[] oddEleArr = new int[cntArray];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddEleArr[idx] = arr[i]; // just store
                idx++;
            }
        }

        return oddEleArr;
    }


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

        int[] oddArrayEle = findOddElement(arr);
        System.out.println("Odd Elements: " + Arrays.toString(oddArrayEle));



    }
}
