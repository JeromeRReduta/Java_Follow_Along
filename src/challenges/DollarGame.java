package challenges;

import java.util.Scanner;

/* Prompts the user to input a number of various US coins.
    If the total money = 1 dollar, they win
    Else, print how much they were over or under by
 */
public class DollarGame {
    public static void main(String[] args) {
        /* Initialize known vars */
        int dollarInCents = 100;
        /* Initialize user input */
        int totalCents;
        System.out.println("Try to get to a dollar using pennies, nickels," +
                "dimes, and quarters!");
        System.out.println("Input the following:");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Number of pennies: ");
            int numPennies = scan.nextInt();
            System.out.println("Number of nickels: ");
            int numNickles = scan.nextInt();
            System.out.println("Number of dimes: ");
            int numDimes = scan.nextInt();
            System.out.println("Number of quarters: ");
            int numQuarters = scan.nextInt();
             totalCents = numPennies
                    + numNickles * 5
                    + numDimes * 10
                    + numQuarters * 25;
        }
        /* Print success or failure message */
        if (totalCents > dollarInCents) {
            System.out.printf("Oof! You're %d cents over!\n",
                    totalCents - dollarInCents);
        }
        else if (totalCents < dollarInCents) {
            System.out.printf("Oof! You're %d cents under!\n",
                    dollarInCents - totalCents);
        }
        else {
            System.out.println("You're exactly right! You win!");
        }
    }
}
