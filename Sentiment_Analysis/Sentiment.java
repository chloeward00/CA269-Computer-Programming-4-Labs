// Your program is now ready to read a movie review and make an educated guess as to its score. So, that is your task. 
// Write a method called sentiment which takes as parameters an unrated review and the name of a file of movie reviews and 
// return the rating of the review. You should make the method a static method of a class called Sentiment. Your method 
// should return a double value which will be the rating of the review based on the file of reviews 
// which your method will be given.



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sentiment
{
    public static double sentiment(String review, String reviewFilename) throws FileNotFoundException
    {
        String [] list = review.split(" ");
        double count = 0;
        double score = 0;
        for(String word:list)
        {
            double total = contain(word, reviewFilename);
            if(total != -1)
            {
                score += total;
                count++;
            }
            
        }
        if(count == 0)
            return -1;
        return score/count;
    }
    
    public static double contain(String word, String filename) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(filename));
        double othercount = 0;
        double otherscore = 0;
        int num;
        String line;
        while(in.hasNextLine())
        {
            line = in.nextLine();
            String [] sentence = line.split(" ");
            num = Integer.parseInt(sentence[0]);
            if((word.equals(".") || word.equals(",")) && line.contains(word))
            {
                otherscore += num;
                othercount++;
            }
            else
            {
                for(String check:sentence)
                {
                    if(check.equals(word))
                    {
                        otherscore += num;
                        othercount++;
                        break;
                    }
                }
            }
        }
        in.close();
        if(otherscore == 0)
            return -1;
        return otherscore/othercount;
    }
}