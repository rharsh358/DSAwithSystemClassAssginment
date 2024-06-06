package devang.dsa;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {3, 5, 1, 8, -2, 7, 6, 0, 9};
        int n = array.length;

        System.out.println("Original array: ");
        printArray(array);

        reverse(array, n);

        // reverseArray(array);

        System.out.println("Reversed array: ");
        printArray(array);

    }

    // two pointer  using inplace
    static void reverse(int[] arr, int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // travelling till half using inplace

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
