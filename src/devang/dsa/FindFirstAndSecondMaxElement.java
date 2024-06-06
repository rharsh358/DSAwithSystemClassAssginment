package devang.dsa;

public class FindFirstAndSecondMaxElement {

    public static void main(String[] args) {
        int arr[] = {-2, 1, 10, 15}; // first = 15, second = 10
        int n = arr.length;   //sizeof(arr)/sizeof(arr[0]); // Number of Elements in Array
        find2Max(arr, n);

        int arr2[] = {-2, 1, 10, 15, 15}; // first = 15, second = 15
        int n2 = arr2.length;  //sizeof(arr2)/sizeof(arr2[0]); // Number of Elements in Array
        find2Max(arr2, n2);

        int arr3[] = {2, 13, 15, 17, 9, 5, 12, 8, 16, 19, 18, 19}; // first = 19, second = 19
        int n3 = arr3.length; // sizeof(arr3)/sizeof(arr3[0]); // Number of Elements in Array
        find2Max(arr3, n3);

        int arr4[] = {4, 1}; // first = 4, second = 1
        int n4 = arr4.length;  //sizeof(arr4)/sizeof(arr4[0]); // Number of Elements in Array
        find2Max(arr4, n4);

        int arr5[] = {1, 1}; // first = 1, second = 1
        int n5 = arr5.length;  //sizeof(arr5)/sizeof(arr5[0]); // Number of Elements in Array
        find2Max(arr5, n5);

        int arr6[] = {1}; // Invalid Input
        int n6 = arr6.length;  // sizeof(arr6)/sizeof(arr6[0]); // Number of Elements in Array
        find2Max(arr6, n6);
    }

    static void find2Max(int arr[], int n) {

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        //int i = 0;

        if (n < 2) {
            System.out.println("Invalid Case");
            return;
        }

        for (int j = 0; j < n; j++) {

            if (arr[j] > first) {

                second = first;
                first = arr[j];

            } else if (arr[j] > second) {

                second = arr[j];
            }
        }

        System.out.print("FirstMax : " + first);
        System.out.println("   SecondMax : " + second);

    }
}
