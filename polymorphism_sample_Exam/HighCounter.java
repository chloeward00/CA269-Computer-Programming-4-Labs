/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        // Read in the word
        String word = in.next();
        int x = 2;
        int i = 1;
        String search = "hi";
        int count = 0;

        while(i < word.length())
        {
                if(search.equals(word.substring(i-1,i+1)))
                { 
                    count = count + 1;
                }
                i++;
        }
        
            System.out.println(count);
    }
}