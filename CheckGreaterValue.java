import java.util.Scanner;

public class CheckGreaterValue {

    public static int getGreaterVal(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the Value of N:= ");
        int n = sc.nextInt();
        System.out.print(" Please enter the Value of M:= ");
        int m = sc.nextInt();

        System.out.println(" :=> " + getGreaterVal(n, m) +" is the Greater Value of M and N.");
    
    }
}
