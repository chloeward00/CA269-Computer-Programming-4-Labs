//Create a class called WordScore. The class should have two attributes, a string called word and an integer called score. There should //be a constructor which takes one String parameter which initialises the word.

//There should be one method called score() which takes string and returns an int. 
//The string represents the review and is in the form of //a score followed by a space and a sentence. The function should return the score if the word is contained in the sentence and should return -1 otherwise.

public class WordScore
{
    String word;

    public WordScore(String line)
    {
    	word = line;
    }

    public int score(String review)
    {
        String[] list = new String [review.length()];
        list = review.split(" ");
        int score = Integer.parseInt(list[1]);
        for(int i=1;i < list.length; i++)
        {   
            if(word.equals(list[i]))
                return score;
        }
        return -1;
    }
}