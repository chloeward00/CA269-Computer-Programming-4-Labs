import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Suspicious
{
    public static void main(String [] args)
    {
    try{
     Scanner students = new Scanner(new File(args[0]));
     Scanner deli = new Scanner(new File(args[1]));

     ArrayList<String> sli = new ArrayList<String>();
     ArrayList<String> dli = new ArrayList<String>();
     
     while(students.hasNextLine())
     {
        sli.add(students.nextLine().trim());
     }

     int i = 1;
     while(deli.hasNextLine())
     {  
        String badboy = deli.nextLine().trim();
        if(sli.contains(badboy))
        {
            System.out.println(i + ". " + badboy);
            i++;
        }
     }
    }
    catch(FileNotFoundException e){
        System.out.println("ok boomer");
    }
    }
}