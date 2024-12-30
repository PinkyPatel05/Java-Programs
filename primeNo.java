// Print prime numbers list till 2 to n.

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:=  ");
        int n = sc.nextInt();

        System.out.println("\n ---: Below are the Prime Numbers: ---");

        // Print primes in a single line
        boolean first = true;  // To avoid printing leading space
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } 
            }
            if (isPrime) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;  // Ensure space is printed only between numbers
            } 
        } 
    }
}
