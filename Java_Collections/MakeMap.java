import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MakeMap
{
    // No main method required.
    public static HashMap makeMap(Scanner in)
    {
        HashMap<String, Integer> map = new HashMap<>();
        while(in.hasNext())
        {
            map.put(in.next(),in.nextInt());
        }

        return map;
    }
}

or 

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MakeMap
{
    // No main method required.
    public static Map <String,Integer> makeMap(Scanner in)
    {
        Map<String, Integer> map = new HashMap<>();
        while(in.hasNext())
        {
            map.put(in.next(),in.nextInt());
        }

        return map;
    }
}