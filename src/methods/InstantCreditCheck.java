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
        boolean isQualified = isUserQualified(salary, creditScore);
        notifyUser(isQualified);
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        double requiredSalary = 25000;
        int requiredCreditScore = 700;
        return salary >= requiredSalary
                && creditScore >= requiredCreditScore;
    }

    public static void notifyUser(boolean isQualified) {
        String message = isQualified ? "Approved" : "Declined";
        System.out.println(message);
    }
}
