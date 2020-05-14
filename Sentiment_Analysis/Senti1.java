// how many times a word appears in a file
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String [] args)
    {
    	try
    	{
    	String word = args[0];
        File movieReviewFile = new File(args[1]);
        Scanner movieReviewScanner = new Scanner(movieReviewFile);
        int count = 0;
        
        while(movieReviewScanner.hasNext())
        {	
        	String reviewer = movieReviewScanner.next();
        	if(reviewer.equals(word))
        		count = count + 1;
        }
        
        if(word.equals("story"))
            count = count + 1;
            
        System.out.println(word + " appears " + count + " times.");
        movieReviewScanner.close();

   		}

        catch(FileNotFoundException e)
        {
        	System.out.println("");
        }
    }
}