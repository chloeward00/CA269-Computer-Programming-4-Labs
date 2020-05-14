public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }


  public Point midPoint(Point point2)
  {
      double pointx = (this.x + point2.x) / 2;
      double pointy = (this.y + point2.y) / 2;
      return new Point(pointx, pointy); // refers back to constructor to initialise new x and y cordinates
  }
   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}