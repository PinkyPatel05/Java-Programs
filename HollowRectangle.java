import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row N = ");
        int n = sc.nextInt();
        System.out.print("Column M = ");
        int m = sc.nextInt();

        //Outer loop
        for(int i=1; i<=n; i++) {
            //Inner Loop
            for(int j=1; j<=m; j++) {
                // check condition
                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }    
            System.out.println();
        }

    }
}
