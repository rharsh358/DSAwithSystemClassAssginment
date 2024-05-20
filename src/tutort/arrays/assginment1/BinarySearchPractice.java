package tutort.arrays.assginment1;

public class BinarySearchPractice {

    static int binarySearchAlgo(int arr[], int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) /2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
         int sortedArray[] ={1,2,3,4,5,6,7,8,9};
         int target = 4;
        int result = binarySearchAlgo(sortedArray, target);
        System.out.println("\nIterative Binary Search:");
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }


    }
}
