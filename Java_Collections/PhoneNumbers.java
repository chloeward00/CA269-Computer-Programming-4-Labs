import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers
{
    public static void main(String [] args)
    {
    	System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
    	Scanner in = new Scanner(System.in);

    	String line = in.nextLine().trim();
    	HashMap<String, String> map = new HashMap<>();
    	while(!line.equals("!!"))
    	{
    		String [] tmp = line.split(" ");
    		String name = tmp[0];
    		String query = tmp[1];

    		if(query.equals("?"))
    		{
    			String number = map.get(name);
    			if(number == null)
    			{
    				System.out.println("Sorry, there is no " + name);
    			}
    			else
    			{
    				System.out.println(name +" has number "+ number);
    			}
    		}
    		else
    		{
    			map.put(name, query);
    		}

    		line = in.nextLine().trim();
    	}
    	System.out.println("Bye");

    }
}