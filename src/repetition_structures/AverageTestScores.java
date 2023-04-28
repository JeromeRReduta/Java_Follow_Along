package repetition_structures;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {
        int numOfStudents = 24;
        int numOfTests = 4;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numOfStudents; i++) {
            double totalScore = 0;
            for (int j = 0; j < numOfTests; j++) {
                System.out.println("What's their score for test " + (j + 1));
                double score = scan.nextDouble();
                totalScore += score;
            }
            double average = totalScore/numOfTests;
            System.out.printf("Average test score for student %d is %f.\n",
                    i + 1,
                    average);
        }
    }
}
