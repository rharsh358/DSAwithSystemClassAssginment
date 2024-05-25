package sunny.dsa;

// https://leetcode.com/problems/move-zeroes/description/

class Solu {
    public void moveZeroes(int[] nums) {
        int indexOfNonZeroValues = 0;

        // If the current element is not 0, then we need to
        // append it just in front of last non zero element we found.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[indexOfNonZeroValues] = nums[i];
                indexOfNonZeroValues++;
            }
        }

        // After we have finished processing new elements,
        // all the non-zero elements are already at the beginning of the array.
        // We just need to fill remaining array with 0's.
        for (int i = indexOfNonZeroValues; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

public class MovesOfZeros {
    public static void main(String[] args) {
        Solu solution = new Solu();
        // Example usage:
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(java.util.Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(java.util.Arrays.toString(nums2)); // Output: [0]
    }
}
