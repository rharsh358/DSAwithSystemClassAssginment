package practice.dsa;

import java.util.Arrays;

// Leetcode Problem : https://leetcode.com/problems/two-sum/


public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        int n = arr.length;
        int[] abc = twoSum(arr, target);

        System.out.println(" Print Array " + Arrays.toString(abc));
    }


    // This is for getting indexes
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if (n < 2) {
            System.out.println("Invalid Input");
            return new int[0];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};

                }
            }
        }
        return new int[0];
    }


    // This is for getting actaul values
    public static int[] twoSum1(int[] nums, int target) {
        int n = nums.length;
        if (n < 2) {
            System.out.println("Invalid Input");
            return new int[0];
        }
        int currentValue = 0;
        int previousValue = 0;
        for (int i = 0; i < n; i++) {    //3, 2, 4


            int temp = nums[i];  // temp = 3,2, 4
            previousValue = currentValue; //  3 2
            currentValue = temp;  // curr valu =3 ,2 , 4

            if (currentValue + previousValue == target) {
                return new int[]{previousValue, currentValue};
            }

        }
        return new int[0];
    }


}
