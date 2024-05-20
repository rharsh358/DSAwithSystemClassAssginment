package sunny.dsa;

import java.util.Scanner;

public class TrangleStarPrintt {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Star: ");  // Prompt the user to enter the number of start
        int n = sc.nextInt();

        for (int row = 1; row <= n; row += 2) {

            for (int space = n - row; space >= 0; space--) {
                System.out.print(" ");
            }

            for (int count = 1; count <= row; count++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
