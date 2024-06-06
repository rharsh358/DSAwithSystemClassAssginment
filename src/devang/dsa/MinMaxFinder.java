package devang.dsa;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7, 6, 0, 9};
        int n = array.length;

        maxAndMinElement(array, n);
    }

    public static void maxAndMinElement(int[] arr, int n) {
        if (arr == null || n == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}