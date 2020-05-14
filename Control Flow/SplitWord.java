/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class SplitWord
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();
        int x = 2;
        int i;
        
        for(i = 0; x <= word.length(); i++)
        {
            System.out.println(word.substring(i,x));
            x = x + 1;
        }
    }
}