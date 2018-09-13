import java.util.*; 
import java.io.*;

/* Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it (e.g. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18 and the input will always be an integer. */

class Main {  
  public static int FirstFactorial(int num) { 
    int res = 1;
    while (num > 0) {
        res = res * (num * (num -1));
        num = num-2;
        if (num == 1){
            return res;
        }
    }
    return res;   
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }    
}