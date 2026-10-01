import java.util.Scanner;

interface Shape
{
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape
{
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape
{
    private double length;
    private double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea()
    {
        return length * breadth;
    }

    public double calculatePerimeter()
    {
        return 2 * (length + breadth);
    }
}

public class MainProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Shape circle = new Circle(radius);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.print("\nEnter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Shape rectangle = new Rectangle(length, breadth);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        scanner.close();
    }
}