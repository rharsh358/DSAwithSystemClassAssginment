package tutort.arrays.assginment1;
import java.util.Scanner;

/*Print below series for n=5
       1
       1 2
       1 2 3
       1 2 3 4
       1 2 3 4 5
       */

public class PrintPattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern: ");
        int sizeOfPat = sc.nextInt();

        for (int i = 0; i <= sizeOfPat ; i++) {
            for (int j = 1; j <= i; j++)

                System.out.print(" "+j);
                System.out.println();
        }
    }
}
