package assignment.devang.ass1;


//2. check couple is eligible for marriage (girl age should be 18 boy should be 21) print yes or no
public class ValidMarrigeAge {
    static boolean vaildAgeForMarrige(int boyAge, int girlAge) {
        boolean res;
        res = boyAge >= 21 && girlAge >= 18 ? true : false;
        return res;
    }

    public static void main(String[] args) {
        boolean res = vaildAgeForMarrige(20, 18);
        System.out.println();
        System.out.println(res ? "Valid Age for Marriage" : "Not Valid Age for Marriage");

        /*if (res == true) {
            System.out.println("Valid Age for Marriage");
        } else {
            System.out.println("Not Valid Age for Marriage");
        }*/
    }
}
