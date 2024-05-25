package sunny.dsa;

// https://leetcode.com/problems/ugly-number/
class Solution3 {
    
    public boolean isUgly(int n) {

        int number = n;
        if (number <= 0) {
            return false;
        }

        int[] primeFactors = {2, 3, 5};

        for (int factors : primeFactors) {
            while (number % factors == 0) {
                number /= factors;
            }
        }

        return number == 1;

    }
}

public class UglyNumber {

    public static void main(String[] args) {

        Solution3 solution = new Solution3();
        // Example usage:
        System.out.println(solution.isUgly(6));   // Output: true
        System.out.println(solution.isUgly(1));   // Output: true
        System.out.println(solution.isUgly(14));  // Output: false

    }
}
