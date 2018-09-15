import java.util.*; 
import java.io.*;

/* Have the function CheckNums(num1,num2) take both parameters being passed and return the string true if num2 is greater than num1, otherwise return the string false. If the parameter values are equal to each other then return the string -1. */

class Main {  
  public static String CheckNums(int num1, int num2) { 
    String result;
    int missingNum;
    
    if (num1 != num2) {
        missingNum = num2 - num1;
        if (missingNum > num1) {
            result = "true";
        } else {
            result = "false";
        }
    } else {
        result = "-1";
    }
    return result;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CheckNums(s.nextLine())); 
  }   
}