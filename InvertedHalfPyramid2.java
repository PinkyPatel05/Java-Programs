import java.util.Scanner;

public class InvertedHalfPyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of N:= ");
        int n = sc.nextInt();
        
        //Outer Loop for Upper part
        for (int i = 1; i <= n; i++) {   
            for (int j = n; j >= i; j--) {
                System.out.print(i);
            } 
            // inner loop for space
            int space = 2*(n-i);
            for(int j=n; j>=space; j--) {
                System.out.print(" ");
            }

            for (int j=n; j>=i; j--) {
                System.out.print(i);
            } 

            System.out.println();
        }
    }
}
