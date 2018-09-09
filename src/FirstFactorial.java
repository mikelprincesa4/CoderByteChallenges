import java.util.*; 
import java.io.*;

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