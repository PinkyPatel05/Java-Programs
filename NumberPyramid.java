
/* 
    1 
   2 2 
  3 3 3
 4 4 4 4
5 5 5 5 5

 */

import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of row and column := ");
        int n = sc.nextInt();

        // Outer Loop
        for(int i=1; i<=n; i++) {

            // Inner Loop for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Inner Loop for Number
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    
    }
}
