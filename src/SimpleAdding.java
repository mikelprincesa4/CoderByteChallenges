import java.util.*; 
import java.io.*;

/* Have the function SimpleAdding(num) add up all the numbers from 1 to num. For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter num will be any number from 1 to 1000. */

class Main {  
  public static int SimpleAdding(int num) { 
    int output;
    if (num == 1){
        output = 2;
    }
    if (num == 2) {
        output = 3;
    } else {
        output = SimpleAdding(num-1) + num;
    }
    return output;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleAdding(s.nextLine())); 
  }   
}