package repetition_structures;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter num of items you want to scan: ");
            int quantity = scan.nextInt();
            double total = 0;

            for (int i = 0; i < quantity; i++) {
                System.out.println("Cost of item " + i + ":");
                double price = scan.nextDouble();
                total += price;
            }
            System.out.println("Total = " + total);
        }
    }
}
