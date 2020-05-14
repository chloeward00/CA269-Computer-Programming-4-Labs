//Create an Animal class with a constructor that initialises a name and that returns a greeting which is
// Hello, my name is name
//where name will be the animal's name.

//Your class will be called by the following Main class

public class Animal 
{
	String name;

	public Animal(String aname)
	{
		name = aname;
	}

	public String greeting()
	{
	 return("Hello, my name is " + name);
	}
}