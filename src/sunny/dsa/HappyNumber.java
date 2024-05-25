package sunny.dsa;

// https://leetcode.com/problems/happy-number/

/*Example 1:
 if the final squer of the value is 1 then it is happy number
Input: n = 19
Output: true
Explanation:
        12 + 92 = 82
        82 + 22 = 68
        62 + 82 = 100
        12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false*/

class Solution {
    private static int isHappyNumber(int num) {
        int totalSum = 0;
        while (num > 0) {
            int digit = num % 10;
            totalSum += digit * digit;
            num /= 10;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = isHappyNumber(n);
        }
        return n == 1;
    }
}

public class HappyNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example usage:
        System.out.println(solution.isHappy(19)); // Output: true
        System.out.println(solution.isHappy(2));  // Output: false
    }


}
