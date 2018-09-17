import java.util.*; 
import java.io.*;

/* Have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon. */

class Main {  
  public static String TimeConvert(int num) { 
    int hours = 0;
    int minutes;
    String time;
    
    while (num >= 60) {
        num -= 60;
        hours++;
    }
    minutes = num;
    time = hours + ":" + minutes;
    return time;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }   
}