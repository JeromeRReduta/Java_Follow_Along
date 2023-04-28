package gross_calculator;

public class GrossPayCalculator {

    public static void main(String[] args){
        int hours = 40;
        double payRate = 25.50;
        double grossPay = hours * payRate;
        System.out.println("Gross pay: " + grossPay);
    }
}
