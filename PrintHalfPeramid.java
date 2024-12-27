
/*
     1 
    1 2    
   1 3 3   
  1 4 4 4  
 1 5 5 5 5 

 if you apply //number = number * (i); logic below, you get output below:

      1 
    1 1  
   1 2 4 
  1 3 9 27
 1 4 16 64 256

 */

import java.util.Scanner;

public class PrintHalfPeramid {
    public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         System.out.print("Number of row:= ");
         int numRows = sc.nextInt(); // Adjust the number of rows as needed

        for (int i = 0; i < numRows; i++) {

            // Inner Loop for spaces
            for(int j = 1; j <= numRows-i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                //number = number * (i);
                number = i + 1;
            }
            System.out.println();
        }
 
     
     }
}
