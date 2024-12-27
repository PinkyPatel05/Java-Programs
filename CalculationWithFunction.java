import java.util.Scanner;

public class CalculationWithFunction {

    public static int calculateSum(int a, int b) {
        int sum = a + b;

        return sum;
    } 

    public static int calculateSub(int a, int b) {
        int sub = a - b;

        return sub;
    }
    public static float calculateMultiply(float a, float b) {
        float multiply = a * b;

        return multiply;
    }

    public static float calculatedivision(float a, float b) {
        float div = a / b;

        return div;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of A:=");
        int a = sc.nextInt();
        System.out.print(" Enter the value of B:=");
        int b = sc.nextInt();

        System.out.println("Addition of A and B is := " + calculateSum(a, b));
        System.out.println("Subtraction of A and B is := " + calculateSub(a, b));
        System.out.println("Multiplication of A and B is := " + calculateMultiply(a, b));
        System.out.println("Division of A and B is := " + calculatedivision(a, b));
    }
}
