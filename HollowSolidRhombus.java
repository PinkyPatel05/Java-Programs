
/* 
    * * * * * 
   *       *
  *       *
 *       *
* * * * *

 */

 import java.util.*;

 public class HollowSolidRhombus {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Number of row and column := ");
         int n = sc.nextInt();
 
         // Outer Loop
         for(int i=1; i<=n; i++) {
 
             // Inner Loop for Spaces
             for(int j=1; j<=n-i; j++) {
                 System.out.print(" ");
             }
 
             // Inner Loop for starts
             for(int j=1; j<=5; j++) {
                if (j==1 || i==1 || j==5 || i==n) {
                    System.out.print("* ");  
                } else {
                    System.out.print("  ");
                }
                 
             }
             System.out.println();
         }
     }
 }