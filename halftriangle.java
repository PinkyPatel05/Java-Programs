import java.util.Scanner;

/* 
 * This program is for below pattern:
 * 
 * *
 * * *
 * * * * 
 */
public class halftriangle {
   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of row and column := ");
        int n = sc.nextInt();

        // Outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("*"); // Start patten
                //System.out.print(j); // Number patten
            }
            System.out.println();
        }
   } 
}
