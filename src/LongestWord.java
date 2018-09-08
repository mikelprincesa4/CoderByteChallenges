import java.util.*; 
import java.io.*;

/* PROMPT: Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. */

class Main {  
  public static String LongestWord(String sen) { 
  
    int largestNum = 0;
    String largestString = "";
    String delims = "[ .!&$]+";
    String[] words = sen.split(delims);
    
    for(int i=0; i < words.length; i++) {
        if (words[i].length() > largestNum) {
            largestNum = words[i].length();
            largestString = words[i];
        }
    }     
    return largestString;   
  } 
  
  public static void main(String[] args[]) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}