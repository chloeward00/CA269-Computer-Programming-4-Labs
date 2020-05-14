public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    public double square (double num)
    {
        return num * num;
    }

    public boolean lessThan(Order other)
    {
        Point otherPoint = (Point) other;
        if(square(this.x) + square(this.y) < square(otherPoint.x) + square(otherPoint.y))
        {
            return true;
        }
        return false;
    }
}
