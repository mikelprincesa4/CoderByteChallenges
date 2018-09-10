import java.util.*; 
import java.io.*;

/*Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH*/

class Main {  
  public static String FirstReverse(String str) { 
    String reverse = "";
    char current;
    
    for (int i =0; i < str.length(); i++){
        current = str.charAt(i);
        reverse = current + reverse;
    }
    return reverse;    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}