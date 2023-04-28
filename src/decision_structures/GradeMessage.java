package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter letter grade: ");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();
        scan.close();
        String message;
        switch(grade) {
            case "A":
                message = "AMAZING";
                break;
            case "B":
                message = "Nice";
                break;
            case "C":
                message = "OKAY!";
                break;
            case "D":
                message = "Do better";
                break;
            case "F":
                message = "failed";
                break;
            default:
                message = "Error";
                break;
        }
        System.out.println(message);
    }
}
