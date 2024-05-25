package sunny.dsa;

// https://leetcode.com/problems/power-of-two/description/
class Solution1 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;

        // alternative of solution
        /*double logBase2 = Math.log(n) / Math.log(2);
        return logBase2 == (int) logBase2;*/

    }
}

public class PowerOfTwo {
    public static void main(String[] args) {
        Solution1 Solution = new Solution1();
        // Example usage:
        System.out.println(Solution.isPowerOfTwo(1));   // Output: true
        System.out.println(Solution.isPowerOfTwo(16));  // Output: true
        System.out.println(Solution.isPowerOfTwo(3));   // Output: false
        System.out.println(Solution.isPowerOfTwo(-16)); // Output: false
    }
}
