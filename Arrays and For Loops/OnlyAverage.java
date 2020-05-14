import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();    
        //int [] numlist = new int[num];

        //System.out.println(nums);
        System.out.print("Enter " + num + " numbers: ");
        double sum = 0.0;
        int i;
        for(i = 0; i < num; i++)
        {
            double nums = in.nextDouble();
            sum = sum + nums;

        }
        
        // and calculate the average (or calculate the average as you read the numbers => no need for an array)
            
        System.out.println("The average is " + sum / num);
    }
}