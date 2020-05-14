
public class Word

{
  static boolean allDone(String word, String letter)
  {
    int i;
    int j;
    int count = 0;
    for(i = 0; i < word.length(); i++)
    {
      
      for(j = 0; j < letter.length(); j++)
      {
        if (word.charAt(i) == letter.charAt(j))
          count++;
      }
    
    }
    return count == word.length();


  }
}

