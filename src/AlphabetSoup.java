import java.util.*; 
import java.io.*;

/* Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the string. 
*/

class Main {  
  public static String AlphabetSoup(String str) { 
    
    char charArray[] = str.toCharArray();
    Arrays.sort(charArray);
    String result = new String(charArray);
    return result;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine())); 
  }   
}