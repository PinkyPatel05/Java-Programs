import java.util.Scanner;

/*
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
1 0 1 0 1 0 1

 */

public class OneZeroTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N:= ");
        int n = sc.nextInt();

        // Outer loop
        for(int i=1; i<=n; i++) {
            //Inner Loop
            for(int j=1; j<=i; j++) {
                int sum = i + j;
                // Check condition  if the value of I and J sum is even print "1" or else print "0".
                //if((i+j) == 0) or
                if(sum % 2 == 0) {
                    // Even Number
                    System.out.print("1 ");
                } else {
                    // Odd Number
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
