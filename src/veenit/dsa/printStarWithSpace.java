package veenit.dsa;

import java.util.Scanner;

public class printStarWithSpace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");  // Prompt the user to enter the number of rows
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) { // Print spaces  - - - - -
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) { // Print stars and spaces
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
