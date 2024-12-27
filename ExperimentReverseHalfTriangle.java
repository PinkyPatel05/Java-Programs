import java.util.Scanner;

public class ExperimentReverseHalfTriangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of N:= ");
        int n = sc.nextInt();
        
        //Outer Loop for Upper part
        for (int i = 1; i <= n; i++) {   
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            } 
            // inner loop for space
            int space = 2*(n-i);
            for(int j=n+1; j>=space; j--) {
                System.out.print("  ");
            }


            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        //Outer Loop for Lower part
        for (int i = n; i >= 1; i--) {   
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            } 
            int space = 2*(n-i);
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }


            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
