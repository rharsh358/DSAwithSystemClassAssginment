package practice.dsa;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
public class PascelTriangel {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }

    // Using Iterative  Approach
    //   Time Complexity O(n2)
    // Space Complexity O(n2)
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last elements of each row are 1
                } else {
                    int left = triangle.get(i - 1).get(j - 1);
                    int right = triangle.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }


    // Using Mathematical Formula (Combinatorial Approach)
    //   Time Complexity O(n2)
    // Space Complexity O(n2)
    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(combination(i, j));
            }
            triangle.add(row);
        }
        return triangle;
    }

    private static int combination(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
