package Shapes;

public interface Shape
{
    double calculateArea();
    double calculatePerimeter();
}

package Shapes;
public class Rectangle implements Shape
{
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth)
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