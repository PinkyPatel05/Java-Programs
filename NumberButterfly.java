import java.util.Scanner;

/*
1        1
22      22
333    333
4444  4444
5555555555
5555555555
4444  4444
333    333
22      22
1        1

 */

public class NumberButterfly {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of row and column := ");
        int n = sc.nextInt();

        //Outer Loop for Upper part
        for(int i=1; i<=n; i++) {
            // Inner loop for first part of stars
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }

            // inner loop for space
            int space = 2*(n-i);
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }

            // Inner Loop for second part of stars
            for(int j=1; j<=i; j++) {
                System.out.print(i);
                
            }
            System.out.println();
        }

        //Outer Loop for Lower part
        for(int i=n; i>=1; i--) {
            // Inner loop for first part of stars
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }

            // inner loop for space
            int space = 2*(n-i);
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }

            // Inner Loop for second part of stars
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
