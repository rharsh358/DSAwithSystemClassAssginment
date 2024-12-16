package practice.dsa;

public class PrintArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        arrPrint(arr, n);
        arrPrint2(arr, n);
        long sum = sumOfArray(arr, n);
        System.out.println("Addition of Array : " + sum);
    }


    // one way to print array
    static void arrPrint(int array[], int n) {

        for (int element : array) {
            System.out.print(" " + element);
        }
        System.out.println();
    }

    // one way to print array
    static void arrPrint2(int array[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.println();
    }


    // sum of array
    static long sumOfArray(int array[], int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }

}
