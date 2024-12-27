import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
       
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.print("Press 1 to continue or 0 to stop:= ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input == 1) {
            System.out.print("enter the number:= ");
            int number = sc.nextInt();
            if(number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }  
            
            System.out.print("Press 1 to continue or 0 to stop:= ");
            input = sc.nextInt();
        }

        System.out.println("Positive Numbers:= " + positive);
        System.out.println("Negative Numbers:= " + negative);
        System.out.println("Zero Numbers:= " + zero);
    }
}
