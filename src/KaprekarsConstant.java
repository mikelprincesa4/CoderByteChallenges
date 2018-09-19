import java.util.*; 
import java.io.*;

/* Have the function KaprekarsConstant(num) take the num parameter being passed which will be a 4-digit number with at least two distinct digits. Your program should perform the following routine on the number: Arrange the digits in descending order and in ascending order (adding zeroes to fit it to a 4-digit number), and subtract the smaller number from the bigger number. Then repeat the previous step. Performing this routine will always cause you to reach a fixed number: 6174. Then performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174). Your program should return the number of times this routine must be performed until 6174 is reached. For example: if num is 3524 your program should return 3 because of the following steps: (1) 5432 - 2345 = 3087, (2) 8730 - 0378 = 8352, (3) 8532 - 2358 = 6174. 
*/

class Main {  
  public static int KaprekarsConstant(int num) { 
  
    ArrayList<Integer>  numArray    = new ArrayList<Integer>();
    StringBuilder       strNum      = new StringBuilder();
    int                 ascend, descend, newTotal = 0, itCount = 0;
    
    while (num != 6174) {
        do{                                                         // Stores num values in int array
            numArray.add(num % 10);                                 
            num /= 10;                                              
        }while(num > 0);                                            
    
        Collections.sort(numArray);                                 // Get Values in ascending order        
        for (int nums : numArray) {                                 
            strNum.append(nums);                                    
        }                                                           
        ascend = Integer.parseInt(strNum.toString());               
        strNum.setLength(0);                                        
    
        Collections.sort(numArray, Collections.reverseOrder());     // Get Values in descending order 
        for (int nums : numArray) {
            strNum.append(nums);
        }
        descend = Integer.parseInt(strNum.toString());
        strNum.setLength(0);
        numArray.clear();
        
        num = descend - ascend;                                     // New Value of num and iteration counter
        if(num < 1000) {
            num *= 10;
        }
        
        itCount++;
    }
    
    return itCount;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(KaprekarsConstant(s.nextInt())); 
  }   
}