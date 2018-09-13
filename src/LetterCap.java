import java.util.*; 
import java.io.*;

/* Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space.  */

class Main {  
  public static String LetterCapitalize(String str) { 
    Scanner stdin = new Scanner(str);
    String curString;
    StringBuilder newWord = new StringBuilder();
    char newChar;
    
    while (stdin.hasNext()){
        curString = stdin.next();
        StringBuilder newString = new StringBuilder(curString);
        newChar = Character.toUpperCase(newString.charAt(0));
        newString.setCharAt(0, newChar);
        newWord.append(newString);
        newWord.append(" ");
    }
    newWord.deleteCharAt(newWord.length()-1);
    return newWord.toString();
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }    
}