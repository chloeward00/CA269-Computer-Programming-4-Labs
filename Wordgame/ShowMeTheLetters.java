
public class Word

{
  static String showLetters(String word, String letter)
  {
    
    char [] werds = new char[word.length()];
    for(int x = 0; x < word.length(); x++)
    {
      werds[x] = '_';
    }

    for(int i = 0; i < word.length(); i++)
    {
      for(int j = 0; j < letter.length(); j++)
      {

        if(word.charAt(i) == letter.charAt(j))
          werds[i] = word.charAt(i);
      }
    }
    
  
    String str = new String(werds);
    return str;



  }
}
