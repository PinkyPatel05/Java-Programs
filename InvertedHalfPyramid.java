import java.util.*;

public class InvertedHalfPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        // Outer Loop
        for(int i=1; i<=n; i++) {
            
            // Inner Loop for Space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Inner Loop for Star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
