package objects;

public class HomeAreaCalculator {

    public static void main(String[] args) {
        Rectangle room1 = new Rectangle(25, 50);
        double room1Area = room1.calculateArea();
        Rectangle room2 = new Rectangle(100, 25);
        double room2Area = room2.calculateArea();
    }

}
