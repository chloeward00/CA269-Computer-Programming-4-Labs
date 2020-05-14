public class Word

{
  static boolean containsLetter(String word, int letter)
  {

    int i;
    for(i = 0; i < word.length(); i++)
    {
      if (word.charAt(i) == letter)
        return true;
    }
    return false;


  }
}