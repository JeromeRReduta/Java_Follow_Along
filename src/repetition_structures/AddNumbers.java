package repetition_structures;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            boolean runAgain = true;
            do {
                System.out.println("Enter first num: ");
                double num1 = scan.nextDouble();
                System.out.println("Enter second num: ");
                double num2 = scan.nextDouble();
                double total = num1 + num2;
                System.out.printf("Your total is %f\n", total);
                System.out.println("Start over? [1] Yes [2] No");
                int choice = scan.nextInt();
                if (choice == 2) {
                    runAgain = false;
                }
            }
            while (runAgain);
        }
    }
}
