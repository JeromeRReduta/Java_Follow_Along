package objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();
        double totalArea = calculateTotalArea(kitchen, bathroom);
        System.out.printf("Combined area is %f\n", totalArea);
    }

    /* ...varName = 0 or more varNames, put in an array
        Will also accept an array
     */
    public static double calculateTotalArea(Rectangle ...rects) {
        double total = 0;
        for (Rectangle rect : rects) {
            total += rect.calculateArea();
        }
        return total;
    }

    public static Rectangle getRoom() {
        System.out.println("Enter length of room:");
        double length = scan.nextDouble();
        System.out.println("Enter width of room:");
        double width = scan.nextDouble();
        return new Rectangle(length, width);
    }
}
