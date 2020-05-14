import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        int [] rev = new int[num];
        int i;
        
        System.out.print("Enter " + num + " numbers: ");
        for(i = 0; i < num; i++)
        {
            rev[i] = in.nextInt();
        }
        
        System.out.print("The numbers reversed are:");
        int len = num - 1;
        for(i = len; i >= 0; i--)
        {
            System.out.print(" " + rev[i]);
        }
        
        System.out.println();
    }
}