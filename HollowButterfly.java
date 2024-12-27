
/*

*             * 
* *         * * 
*   *     *   * 
*     * *     * 
*     * *     * 
*   *     *   *
* *         * *
*             *

*/

import java.util.*;

public class HollowButterfly {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Number of row and column := ");
        int size = sc.nextInt();
        //int n = 4;

        //Outer Loop for Upper part
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }               
            }
           for (int j = 1; j <= 2 * (size - i); j++) {
               System.out.print("  ");
           }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }                
            }
            System.out.println();
        }

        //Outer Loop for Lower part of butterfly
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }  
            }
            for (int j = 1; j <= 2 * (size -i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}