package tutort.arrays.assginment1;

public class FirstEvenFinder {

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 6, 3, 5};
            int result1 = findFirstEven(arr1);
            System.out.println("Result 1: " + result1);

            int[] arr2 = {1, 7, 9, 3, 5};
            int result2 = findFirstEven(arr2);
            System.out.println("Result 2: " + result2);

            int[] arr3 = {1, 7, 4, 8, 5};
            int result3 = findFirstEven(arr3);
            System.out.println("Result 3: " + result3);
        }

        static int findFirstEven(int[] arr) {
            for (int element : arr) {
                if (element % 2 == 0) {
                    return element;
                }
            }
            return -1; // Return -1 if no even number is found
        }

}
