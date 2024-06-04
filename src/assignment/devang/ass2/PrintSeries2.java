package assignment.devang.ass2;


/*5. Print below series for n=5
        12345
        1234
        123
        12
        1*/

public class PrintSeries2 {

    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
