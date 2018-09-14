import java.util.*; 
import java.io.*;

/* Have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable sequence by either returning the string true or false. The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol. So the string to the left would be false. The string will not be empty and will have at least one letter. 
*/

class Main {  
  public static String SimpleSymbols(String str) { 
  
    char[] charArray = str.toCharArray();
    String result = "";
    
    for (int i = 0; i<charArray.length; i++){
        if (Character.isLetter(charArray[i])){
            if (i == 0 || i == charArray.length-1) {
                result = "false";
                break;
            } else if (charArray[i-1] == '+' && charArray[i+1] == '+') {
                result = "true";
            } else {
                result = "false";
            }
            if (result == "false") {
                break;
            }
        }
    }
    return result;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
  }   
}