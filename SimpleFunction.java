import java.util.Scanner;

public class SimpleFunction {

    // declare User define function
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
       
        // take name from the User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name:= ");
        String name = sc.next();

        // call function
        printMyName("Hello " + name);
    }
}
