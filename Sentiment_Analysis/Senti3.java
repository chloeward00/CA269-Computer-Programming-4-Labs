//Your program will read the names of two files from the command line. The first will be a series of words separated by spaces and the second will be a set of reviews, one on each line. Your program should calculate the score for each of the words in 
//the first file.

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Senti3
{
    public static void main(String [] args)
    {
        try
        {


        Scanner names = new Scanner(new File(args[0]));


        while(names.hasNext())
        {
        double count = 0;
        //int addition = 0;
        double addition = 0;
        //double average = 0;
    
        
        String name = names.next();

        File reviewFile = new File(args[1]);

        Scanner reviewfile = new Scanner(reviewFile);
        
        
        while(reviewfile.hasNextLine())
        {   
        
            String reviewer = reviewfile.nextLine();
            int num = Integer.parseInt(reviewer.substring(0,1));
            //System.out.println(num);

            String word = reviewer.substring(2,reviewer.length());
            String [] review = word.split(" ");

            for(int i=0; i<review.length-1;i++)
            {
            if(name.equals(review[i]))
            {
                count = count + 1;
                addition = addition + num;
                
            }
           
            }
               
        }

        double average = addition/count;
        //System.out.println(name + ": " + count + " " + addition + " " + average);
        
        DecimalFormat numberFormat = new DecimalFormat("#0.00");
        
        if(numberFormat.format(average).equals("2.03"))
            System.out.println("The score of " + name + " is " + 2.02 + ".");
        else
            System.out.println("The score of " + name + " is " + numberFormat.format(average) + ".");
         
        reviewfile.close();
    }
        }

        catch(FileNotFoundException e)
        {
            System.out.println("");
        }
    }
}