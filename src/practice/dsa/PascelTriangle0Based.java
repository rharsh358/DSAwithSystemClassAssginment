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
}
