package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String[] args) {
        /* Get input */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter salary: ");
        double salary = scan.nextDouble();
        System.out.println("Enter credit score: ");
        int creditScore = scan.nextInt();
        scan.close();
        /* Check if user is qualified */
        isUserQualified(salary, creditScore);
    }

    public static void isUserQualified(double salary, int creditScore) {
        double requiredSalary = 25000;
        int requiredCreditScore = 700;
        boolean isQualified = salary >= requiredSalary
                && creditScore >= requiredCreditScore;
        String message = isQualified ? "Approved" : "Declined";
        System.out.println(message);
    }
}
