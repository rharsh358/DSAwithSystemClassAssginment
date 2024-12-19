package practice.dsa;


// LeetCode:  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSumOneIndexedBased {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int target = 6;
        int n = arr.length;
        int[] abc = twoSum(arr, target);
        //int[] abc = twoSumTwoPointer(arr, target);


        System.out.println(" Print Array " + Arrays.toString(abc));
    }


    // Brute Force By me Search Solution
    //   Time Complexity OO(n2)
    // Space Complexity O(1)
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

    public static int[] twoSumTwoPointer(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed
            } else if (sum < target) {
                left++; // Move the left pointer to increase the sum
            } else {
                right--; // Move the right pointer to decrease the sum
            }
        }
        return new int[]{-1, -1}; // This won't happen since the problem guarantees one solution
    }


    //Two Pointers Approach (Optimal Solution)
    //   Time Complexity O(n)
    // Space Complexity O(1)

    // Brute Force
    public int[] twoSumBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1}; // 1-indexed
                }
            }
        }
        return new int[]{-1, -1}; // This won't happen since the problem guarantees one solution
    }


    // Binary Search Solution
    //   Time Complexity O(n⋅logn)
    // Space Complexity O(1)

    public int[] twoSumWithBinary(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            int index = binarySearch(numbers, i + 1, numbers.length - 1, complement);
            if (index != -1) {
                return new int[]{i + 1, index + 1}; // 1-indexed
            }
        }
        return new int[]{-1, -1};
    }

    private int binarySearch(int[] numbers, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
