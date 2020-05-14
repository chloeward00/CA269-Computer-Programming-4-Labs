public abstract class Animal
{
    private String name;
    public Animal(String n)
    {
        name = n;
    }

    abstract String hello(); // call hello for other animal classes to get it in this file
    
    public String greeting() // reference it here
    {
        return hello() + ", I am " + name;
    }
    // private
}