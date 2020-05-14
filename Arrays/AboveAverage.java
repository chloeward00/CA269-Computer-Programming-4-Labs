//
// Supplied code to help ensure there will be no output formatting issues.
//
import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        double numbers [] = new double[num];
        
        System.out.print("Enter " + num + " numbers: ");
        double sum = 0.0;
        for(int i=0; i < num;i++)
        // Now read in the numbers
        {
            numbers[i] = in.nextDouble();
            sum += numbers[i];
        }
        double average = sum/num;
        // Print out the numbers greater than the average
        System.out.println("The above average numbers are:");
        // You can use the following code to print out one number
        for(int i=0;i < numbers.length;i++)
        {
            if(numbers[i] > average)
            {
             System.out.print(" " + numbers[i]); // You may want to put this in a loop.
            }

        }
       

        System.out.println(); // Should finish with a new line
    }
}