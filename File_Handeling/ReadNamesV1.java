import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNames
{
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String file_name = in.nextLine();
		//System.out.println(file_name);

		in = new Scanner(new File(file_name)); // opening file
		int num = in.nextInt(); // getting first number in file
		String [] names = new String[num]; // initialising the length of the new list
		//System.out.println(names);
		for(int i=0;i < num;i++)
		{
			names[i] = in.next(); // for next word on line
		}
		System.out.println("The names in reverse order are: ");
		for(int i= num-1;i >= 0;i--)
		{
			System.out.print(names[i] + " ");

		}
		System.out.println();
	}

}