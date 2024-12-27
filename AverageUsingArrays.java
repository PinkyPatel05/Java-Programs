// this code  is without array.

import java.util.Scanner;

public class AverageUsingArrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of A:= ");
        int a = sc.nextInt();
        System.out.print("Please enter the value of B:= ");
        int b = sc.nextInt();
        System.out.print("Please enter the value of C:= ");
        int c = sc.nextInt();
        System.out.println();

        int average = (a + b + c) / 3;
        System.out.println("This is the average of above numbers:= " + average);
    }
}
