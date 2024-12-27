
/* 
      1 
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1 
 1 5 10 10 5 1

 */

 import java.util.*;

 public class Pascalstriangle {
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
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
 
     
     }
 }

 
