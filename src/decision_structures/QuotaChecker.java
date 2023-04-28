package decision_structures;

import java.util.Scanner;

/*
Print a congratulatory message if employees makes >=10 sales
Else, tell them how many sales they fell short by
 */
public class QuotaChecker {

    public static void main(String[] args) {
        // Init values
        int quota = 10;
        System.out.println("How many sales did you make this week?");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();
        // If you've made quota, give a nice message
        if (sales >= quota) {
            System.out.println("Congrats! You've met your quota!");
        }
        // Else, tell them how many they failed by
        else {
            int salesShort = quota - sales;
            System.out.printf("You were short by %d sales!\n", salesShort);
        }
    }
}
