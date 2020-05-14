import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class Senti2 {
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File(args[1]));
		String word = args[0];
		int count = 0;
		double total = 0;
		int amountcurrent;
		int amountreviews = 0;
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			String[] splited;
			if(line.substring(0, 1).equals(" "))
				splited = line.substring(1, line.length()).split("\\s+");
			else
				splited = line.split("\\s+");
			amountcurrent = 0;
			for(int i = 0; i < splited.length; i ++)
			{
				if(splited[i].contains(args[0]))
				{
					amountcurrent++;
					count++;
					total = total + Integer.parseInt(splited[0]);
				}
			}
			if(amountcurrent > 0)
			{
				amountreviews++;
			}
		}
		System.out.println(args[0] + " appears " + count + " times.");
		if(amountreviews != 0)
		{
			DecimalFormat numberFormat = new DecimalFormat("#0.00"); 
		    double average = total/amountreviews;
		    System.out.println("The average score of the reviews containing " + word + " is " + numberFormat.format(average));
		}
		else
    		System.out.println("The average score of the reviews containing " + word + " is 0.00");
	}
}
