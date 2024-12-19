package practice.dsa;

import java.util.Arrays;
import java.util.HashMap;

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


    // Brute Force

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


    // Brute Force By me Search Solution
    //   Time Complexity OO(n2)
    // Space Complexity O(1)
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Fallback
    }

    // HashMap Approach (Optimized Solution)
    //   Time Complexity O(n)
    // Space Complexity O(n)
    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // Fallback
    }


    //Two Pointers Approach
    //   Time Complexity O(n)
    // Space Complexity O(1)

    public int[] twoSumTwoPointers(int[] nums, int target) {
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new int[]{nums[i], i};
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];
            if (sum == target) {
                return new int[]{pairs[left][1], pairs[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // Fallback
    }


}
