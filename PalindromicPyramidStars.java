
/*
  *
 ***
*****
 ***
  *

 */

import java.util.Scanner;

public class PalindromicPyramidStars {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N := ");
        int n = sc.nextInt();

        // Outer Loop for Upper part
        for(int i=1; i<=n; i++) {

            // Inner Loop for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Inner Loop for First half Number
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }

             // Inner Loop for Second half Number
             for(int j=2; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        
        // Outer Loop for Lower part
        for(int i=n-1; i>=1; i--) {

            // Inner Loop for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Inner Loop for First half Number
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }

             // Inner Loop for Second half Number
             for(int j=2; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
