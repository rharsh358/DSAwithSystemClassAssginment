package tutort.leetcode.assignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/


/*Input: nums = [3,2,4], target = 6
Output: [1,2]*/

/*Input: nums = [3,3], target = 6
Output: [0,1]*/

public class TwoSum {

    /*static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }
            complementMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }*/

    static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum > target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
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
            System.out.print("Enter the target of two sum: ");
            int target = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Element of Array:" + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            prinArray(arr);
            int[] twoSome = twoSum(arr ,target);
            System.out.println("Odd Elements: " + Arrays.toString(twoSome));
        }


    }
