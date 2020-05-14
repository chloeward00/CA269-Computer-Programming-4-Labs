public class Test
{
    // This method returns a String and receives a String
    public static String firstShallBeLast(String word)
    {
      String first = word.substring(0,1);
      String middle = word.substring(1 , word.length() - 1);
      String last = word.substring(word.length() - 1);
   	  String ans = last + middle + first;

      return ans;
    }
}