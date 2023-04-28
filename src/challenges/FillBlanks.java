package challenges;

import java.util.Scanner;

public class FillBlanks {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Input current season: ");
            String season = scan.next();
            System.out.println("Input whole number: ");
            int num = scan.nextInt();
            System.out.println("Gimme an adjective now: ");
            String adjective = scan.next();
            System.out.printf("On an %s %s day, I drank a minimum of %d cups of coffee.\n",
                    adjective,
                    season,
                    num);
        }
    }
}
