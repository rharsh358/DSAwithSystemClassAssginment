package assignment.devang.ass1;

//3. print tax amount if bill amount is 50000 above then tax is 10% else 5% , using ternary operator

public class TaxAmount {
    static double taxPercentageForBill(double amount) {
        double res;
        res = amount > 50000 ? amount * 0.10 : amount * 0.05;
        return res;
    }

    public static void main(String[] args) {
        double tax = taxPercentageForBill(1000);
        System.out.println(tax);
    }
}
