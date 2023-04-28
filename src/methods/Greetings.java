package methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greetUser();
    }

    /* Greets the user after taking input */
    public static void greetUser() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter name: ");
            String name = scan.next();
            System.out.printf("Hi %s\n", name);
        }
    }
}
