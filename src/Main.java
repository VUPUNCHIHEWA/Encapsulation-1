public class Main {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5.0
        Circle myCircle = new Circle(5.0);

        // Get the current radius
        double currentRadius = myCircle.getRadius();
        System.out.println("Radius: " + currentRadius);

        // Calculate and print the area
        double area = myCircle.calculateArea();
        System.out.println("Area: " + area);

        // Calculate and print the perimeter
        double perimeter = myCircle.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);

        // Set a new radius
        myCircle.setRadius(7.0);

        // Get the updated radius
        currentRadius = myCircle.getRadius();
        System.out.println("Updated Radius: " + currentRadius);

        // Recalculate and print the updated area
        area = myCircle.calculateArea();
        System.out.println("Updated Area: " + area);

        // Recalculate and print the updated perimeter
        perimeter = myCircle.calculatePerimeter();
        System.out.println("Updated Perimeter: " + perimeter);
    }
}

