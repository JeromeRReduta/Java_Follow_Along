package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        int hours = 0;
        System.out.println("How many hours did you work?");
        Scanner scan = new Scanner(System.in);
        hours = scan.nextInt();
        double payRate = 0;
        System.out.println("What's your pay rate?");
        payRate = scan.nextDouble();
        scan.close();
        double grossPay = hours * payRate;
        System.out.println("Gross pay: " + grossPay);
    }
}
