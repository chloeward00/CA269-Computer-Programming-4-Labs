// Write your Hangman class here
import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        // First get the word
        int wordSeed = in.nextInt();
        String word = Word.getWord(wordSeed);

        // Now you have the word ... encourage the user to guess.
        String guessword = "";
        
        for(int i = 0; i < word.length(); i++)
        {
            guessword = guessword + "_";
        }
        System.out.println("The word is");
        System.out.println(guessword);

        String guessed = "";
        String show = "";
        while(!Word.allDone(word, show))
        {
            System.out.println("Guess a letter:");
            guessed = guessed + in.next();
            show = Word.showLetters(word, guessed);
            System.out.println(show);
        }

        System.out.println("Well Done, the word was " + word + ".");
        
        

    }
}
