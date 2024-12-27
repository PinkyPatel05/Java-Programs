import java.util.Scanner;

public class EligiableForVote {

    public static boolean geteligiblility(int age) {
        if (age > 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the Value of N:= ");
        int n = sc.nextInt();

        if(geteligiblility(n) == true) {
            System.out.println(" Person is eligible for the Vote.");
        } else {
            System.out.println(" Person is not eligible for the Vote.");
        }
        
    }
}
