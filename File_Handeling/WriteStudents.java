import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteStudents
{


   public static void main(String [] args)
   {
    try
    {
      Scanner in  = new Scanner(new File(args[0]));
      int num = in.nextInt();
  
      PrintWriter outFile = new PrintWriter(new File(args[1])); // file we're writing to
      String [] group = new String [num]; // initialising group array
      for (int i = 0; i < num; i++)
      {
         String name = in.next();
         String mark = String.valueOf(in.nextInt() + 1);
         group[i] = String.join(" ",name,mark) + "\n";
      }

      outFile.println(num);
      for (int j = 0; j < num; j++)
      {
         outFile.print(group[j]); // printing student array to the output file
      }  
      outFile.close();
    }
    catch(Exception e)
    {
        System.out.println();
    }

   }  
}