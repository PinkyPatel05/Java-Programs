import java.util.Scanner;

/*
 12345
 1234
 123
 12
 1
 OR
* * * *
* * *
* *
*

 */
public class InvertNumberTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        // Outer Loop
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
                //System.out.print("*");
            }
            System.out.println();
        }

        /* 
         *  The other logic for same pattern
         //Outer Loop
        for(int i=n; i>=1; i--) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j);
                //System.out.print("*");
            }
            System.out.println();
        }
         */

    }
}
