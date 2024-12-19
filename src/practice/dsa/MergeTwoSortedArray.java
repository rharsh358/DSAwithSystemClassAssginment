package practice.dsa;

import java.util.Arrays;

// LeetCode https://leetcode.com/problems/merge-sorted-array/

public class MergeTwoSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {2, 10, 14, 0, 0, 0, 0};
        int[] nums2 = {11, 13, 55, 77};
        int m = 3;
        int n = 4;

        merge1(nums1, m, nums2, n);
        arrPrint(nums1);
    }


    //Two Pointers Approach
    //   Time Complexity O((m+n)
    // Space Complexity  O(1)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2
        int p = m + n - 1; // Pointer for the merged array

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }

        // If nums2 has remaining elements, copy them to nums1
        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }

    static void arrPrint(int array[]) {

        for (int element : array) {
            System.out.print(" " + element);
        }
        System.out.println();
    }


    //Brute Force + Sort
    //   Time Complexity O((m+n) & log(m+n))
    // Space Complexity  O(1)
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n); // Copy nums2 into nums1
        Arrays.sort(nums1); // Sort the merged array
    }


    /*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < m; i++) {


            if (nums1[i] == 0) {

                for (; j < n; ) {

                    if (nums2[j] != 0) {
                        nums1[i] = nums2[j];
                        break;
                    }

                }
                j++;
            }

        }
        Arrays.sort(nums1);
        arrPrint(nums1);
    }*/

}


