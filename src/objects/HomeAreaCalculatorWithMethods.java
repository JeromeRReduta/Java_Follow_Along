package objects;

public class HomeAreaCalculatorWithMethods {

    public static void main(String[] args) {
        Rectangle kitchen = new Rectangle(200, 300);
        Rectangle bathroom = new Rectangle(420, 6900);
        double totalArea = calculateTotalArea(kitchen, bathroom);
        System.out.printf("Combined area is %f\n", totalArea);
    }

    public static double calculateTotalArea(Rectangle rect1, Rectangle rect2) {
        return rect1.calculateArea()
                + rect2.calculateArea();
    }
}
