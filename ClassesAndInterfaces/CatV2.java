// Modify this class so that it implements the Order interface
public class Cat implements Order
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public double square (double num)
    {
        return num * num;
    }
    
    public boolean lessThan(Order other)
    { 
        Cat otherCat = (Cat) other; // calling from Cat intructor then casting Cat onto other
        return this.name.length() < otherCat.name.length();
    }
    
    public String toString()
    {
        return "Cat: " + name;
    }
}