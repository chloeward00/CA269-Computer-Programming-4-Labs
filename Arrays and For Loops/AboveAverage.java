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
        double [] numbers = new double[num];
        double sum = 0.0;
        int i;
        
        System.out.print("Enter " + num + " numbers: ");
        for(i = 0; i < num; i++)
        {
            numbers[i] = in.nextDouble();
            sum = sum + numbers[i];
        }

        double average = sum / num;
        System.out.print("The above average numbers are:" + "\n");

        for(i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > average)
            {
                System.out.print(" " + numbers[i]);
            }
        }
        System.out.println(); // Should finish with a new line
    }
}