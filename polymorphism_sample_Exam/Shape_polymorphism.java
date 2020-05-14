public class Circle extends Shape
{
    double rad;
    public Circle(String name, Double a)
    {
        super(name);
        rad = a;
    }
    public double area()
    {
        return Math.PI * rad * rad;
    }
}