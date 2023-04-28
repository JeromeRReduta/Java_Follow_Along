package decision_structures;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {
        System.out.println("Enter your test score: ");
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        scan.close();
        char grade;
        int maxFScore = 60;
        int maxDScore = 70;
        int maxCScore = 80;
        int maxBScore = 90;
        if (score < maxFScore) {
            grade = 'F';
        }
        else if (score < maxDScore) {
            grade = 'D';
        }
        else if (score < maxCScore) {
            grade = 'C';
        }
        else if (score < maxBScore) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is " + grade);

    }
}
