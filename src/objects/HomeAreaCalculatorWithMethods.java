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

    public static double calculateTotalArea(Rectangle rect1, Rectangle rect2) {
        return rect1.calculateArea()
                + rect2.calculateArea();
    }

    public static Rectangle getRoom() {
        System.out.println("Enter length of room:");
        double length = scan.nextDouble();
        System.out.println("Enter width of room:");
        double width = scan.nextDouble();
        return new Rectangle(length, width);
    }
}
