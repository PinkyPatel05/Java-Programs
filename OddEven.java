import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:= ");
        int n = sc.nextInt();

        System.out.println("---:Below is the Even Numbers:---");
        for(int i=1; i<=n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } 
        }

        System.out.println("---:Below is the Odd Numbers:---");
        for(int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            } 
        }
    }
}
