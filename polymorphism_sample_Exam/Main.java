import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int len = in.nextInt();
        
        int [] num = new int[len];
        System.out.print("Enter " + len + " numbers: ");
        for(int i = 0; i < num.length; i++)
            num[i] = in.nextInt();
            
        Test.reverse(num);

        System.out.print("The numbers reversed are:");
        for(int i = 0; i < num.length; i++)
            System.out.print(" " + num[i]);
            
        System.out.println();
    }
}