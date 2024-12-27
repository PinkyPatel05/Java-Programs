// Print prime number till n.

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:=  ");
        int n = sc.nextInt();

        System.out.println("\n ---:Below is the Prime Numbers:---");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j*j<=i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } 
            }
            if (isPrime) {
                System.out.println(i + " ");
            } 
        }               
    }
}
