mport java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two lines:");
        // Read in the two lines
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int numMatching = 0;
        // INSERT YOUR CODE HERE
        int minLength = Math.min( line1.length(), line2.length() );

        int count = 0;
        for (int i = 0; i < minLength; i++){
        char ch1 = line1.charAt(i);
         char ch2 = line2.charAt(i);
        if (ch1 == ch2) {
        count++;
    }
}
        // it should work out what the number of matching characters is
        
        // Print out the solution
        System.out.println("There are " + count + " corresponding characters.");
    }
}