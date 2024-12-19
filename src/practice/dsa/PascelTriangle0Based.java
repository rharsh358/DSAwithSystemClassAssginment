package practice.dsa;

import java.util.ArrayList;
import java.util.List;

public class PascelTriangle0Based {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }


    // Using Iterative  Approach
    //   Time Complexity O(k2)
    // Space Complexity O(k)
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // First element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // First element is always 1
            for (int j = 1; j < i; j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1); // Last element is always 1
            row = newRow;
        }
        return row;
    }


    // Using Mathematical  Approach
    //   Time Complexity O(k)
    // Space Complexity O(k)
    public static List<Integer> getRow1(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long value = 1; // First value is always 1
        row.add((int) value);

        for (int i = 1; i <= rowIndex; i++) {
            value = value * (rowIndex - i + 1) / i; // Compute the next value
            row.add((int) value);
        }

        return row;
    }
}
