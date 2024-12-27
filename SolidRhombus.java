
/* 
     * * * * * 
   * * * * * 
  * * * * *
 * * * * *
* * * * *

 */

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of row and column := ");
        int n = sc.nextInt();

        // Outer Loop
        for(int i=1; i<=n; i++) {

            // Inner Loop for Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Inner Loop for starts
            for(int j=1; j<=5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
