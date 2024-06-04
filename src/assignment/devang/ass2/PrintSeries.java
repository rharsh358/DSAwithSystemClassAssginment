package assignment.devang.ass2;

/*4. Print below series for n=5
        1
        12
        123
        1234
        12345*/

public class PrintSeries {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}

