
public class Word

{
  static String showLetter(String word, int letter)
  {
    String ans = "";
    int i;
    for(i = 0; i < word.length(); i++)
    {
      if(word.charAt(i) == letter)
        ans = ans + word.charAt(i);
      else
        ans = ans + "_";

    }

    return ans;
  }
}