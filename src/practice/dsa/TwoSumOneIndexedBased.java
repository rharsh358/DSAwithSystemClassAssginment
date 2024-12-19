package practice.dsa;


// LeetCode:  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSumOneIndexedBased {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        int n = arr.length;
        int[] abc = twoSum(arr, target);

        System.out.println(" Print Array " + Arrays.toString(abc));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        if (n < 2) {
            System.out.println("Invalid Input");
            return new int[0];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    i++;
                    j++;
                    return new int[]{i, j};

                }
            }
        }
        return new int[0];
    }
}
