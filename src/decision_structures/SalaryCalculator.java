package decision_structures;

import java.util.Scanner;

/* All employees get $1000/week. Those who get >10 sales get a bonus of $250. */
public class SalaryCalculator {

    public static void main(String[] args) {
        // Initialize values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        System.out.println("How many sales did you make this week?");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();
        // If we exceed 10 sales, add bonus
        if (sales > quota) {
            salary += bonus;
        }
        // Output
        System.out.printf("Pay: %d\n", salary);
    }
}
