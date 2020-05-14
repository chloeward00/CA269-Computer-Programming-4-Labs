public class Cat implements Polite // just putting implements Polite to implement the polite interface
{
    private String name; // changing it so that it implements the polite interface
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "cat: " + name;
    }

    public void hello()
    {
    	
    }
}