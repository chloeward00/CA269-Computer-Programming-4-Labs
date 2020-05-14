public class Word

{
  static boolean isFirstLetter(String word, int letter)
  {
    
    boolean isFirstLetter;
    isFirstLetter = word.charAt(0) == letter;

    if(isFirstLetter)
      return true;
    else
      return false;

  }
}



  