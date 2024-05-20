package sunny.dsa;

public class IsLeapYear {
    public static void main(String[] args) {

        int year = 1900;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

            System.out.println(year + " year is a leap year");
        } else {

            System.out.println(year + " year is not leap year");
        }

    }
}
