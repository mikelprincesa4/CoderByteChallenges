import java.util.*; 
import java.io.*;

/*Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string. */

class Main {  
  public static String LetterChanges(String str) { 
  
    String newWord = "";
    char curChar, nextChar;
    int length = str.length();
    HashSet<Character> vowels = new HashSet<Character>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    
    for (int i = 0; i<length;i++){
        if (Character.isLetter(str.charAt(i))) {
        curChar =(char) (str.charAt(i) + 1);
            if (vowels.contains(curChar)){
                nextChar = Character.toUpperCase(curChar);
            } else {
                nextChar = curChar;
            }
        } else {
            nextChar = str.charAt(i);
        }
        newWord = newWord + nextChar;
    }
    return newWord;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
}