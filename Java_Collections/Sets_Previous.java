import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections; 

public class Previous 
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		Set<Integer> numbers = new HashSet<Integer>();

		System.out.println("Enter some numbers (-1 to end)");
		int num = in.nextInt();
		System.out.println("Previous:");
		while(num != -1)
		{
			if(numbers.contains(num))
				System.out.println(num);
				
			else
				numbers.add(num);
			num = in.nextInt();
		}
	}
}