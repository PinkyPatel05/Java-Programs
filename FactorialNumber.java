import java.util.Scanner;

public class FactorialNumber {

    public static void printFactorial(int n) {
        int factorial = 1;
        // loop
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial value is:= " + factorial);
        return;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:= ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}
