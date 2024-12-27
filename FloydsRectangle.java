import java.util.Scanner;

/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */

public class FloydsRectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of row and column := ");
        int n = sc.nextInt();
        int number = 1;

        // Outer loop
        for(int i=1; i<=n; i++) {
            //Inner Loop
            for(int j=1; j<=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
