import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
public class WordLength
{
    public static void main(String [] args)
    {

    	Scanner in = new Scanner(System.in);
    	HashMap<Integer, Integer> map = new HashMap<>();

        while(in.hasNext())
        {
    	String [] words = in.nextLine().trim().split(" ");

    	int i;
    	int counter = 0;
   
    	for(i=0; i < words.length;i++)
    	{
    		int len = words[i].length();

    		if(!map.containsKey(len))
    		{
    			map.put(len, 0);
    				
    		}

    		if(map.containsKey(len))
    		{
    			counter = map.get(len);
    			counter ++;
    		
    		}

    	map.put(len, counter);

    	}
        }
    	for(Map.Entry entry : map.entrySet())
    		System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}