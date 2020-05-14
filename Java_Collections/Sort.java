import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;  

public class ListSort
{
	public static void main(String [] args)
	{
		List <Integer> numbers = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		int num = in.nextInt();

		while(num != -1)
		{
			numbers.add(num);
			num = in.nextInt();
		}
	Collections.sort(numbers);
	System.out.print("Sorted: ");
	for(int n:numbers)
	{
		System.out.print(n + " ");
	}
	}
}