package sunny.dsa;

public class ReverseStarPrintt {


    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int space = 5 - row; space >= 0; space--) {
                System.out.print(" ");
            }

            for (int count = 1; count <= row; count++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
