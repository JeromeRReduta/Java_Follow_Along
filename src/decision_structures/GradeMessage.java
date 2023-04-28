package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter letter grade: ");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();
        scan.close();
        /* Switch expressions usually better if assigning */
        String message = switch(grade) {
            case "A" -> "Amazing!";
            case "B" -> "NICE";
            case "C" -> "OKAY";
            case "D" -> "DO BETTER";
            case "F" -> "FAILED";
            default -> {
                System.out.println("What have you done");
                yield "ERROR";
            }
        };
        System.out.println(message);
    }
}
