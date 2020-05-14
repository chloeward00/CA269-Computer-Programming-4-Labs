/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class FirstMiddleLast
{

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        System.out.println(word.substring(0,1) + '\n' + word.substring(1, word.length() - 1) + '\n' + word.substring(word.length() - 1));
    }
}