import java.util.Scanner;

public class PrimeNumUsingFunction {

    // create User define function
    public static int checkPrimeNumber(int n) {
        if(n < 2) {
            return 0;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the number:= ");
        int number = sc.nextInt();
    
        int primenum = checkPrimeNumber(number);
    
            if(primenum == 1)  {
                System.out.println(" Number is prime.");
            } else {
                System.out.println(" Number is not prime.");
            }
        
    }
   
}
    

