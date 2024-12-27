import java.util.Scanner;

public class SumofOddNumUsingFun {

    public static void printSumofOdd(int n) {
        int sum = 0;

        for(int i=1; i<=n; i++) {
            if(i % 2 == 1) {
                sum = sum + i;
            }
        }
        System.out.println("This is the Sum of Odd numbers 0 to "+ n + ":= " + sum);
    }

    public static void printSumofEven(int n) {
        int sum = 0;

        for(int i=1; i<=n; i++) {
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("This is the Sum of Even numbers 0 to "+ n + ":= " + sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number:= ");
        int number = sc.nextInt();
        
        printSumofOdd(number);
        printSumofEven(number);
    }
}
