import java.util.Scanner;

public class InvertTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        //Outer Loop
        for(int i=n; i>=1; i--) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
