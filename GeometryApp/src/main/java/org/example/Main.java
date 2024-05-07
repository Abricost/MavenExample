package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle:");
        System.out.println("Square: " + circle.calculateSquare());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Diameter: " + circle.calculateDiameter());

        System.out.println("\nRectangle:");
        System.out.println("Square: " + rectangle.calculateSquare());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Square: " + triangle.calculateSquare());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        boolean squaresEqual = GeometryUtils.compareAreas(circle.calculateSquare(), rectangle.calculateSquare());
        System.out.println("\nAre Square equal between circle and rectangle?: " + squaresEqual);

        Cube cube = new Cube(3);
        System.out.println("\nCube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateSurfaceArea());
    }
}