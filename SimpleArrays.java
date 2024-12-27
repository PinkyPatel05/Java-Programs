import java.util.Scanner;

public class SimpleArrays {
    public static void main(String[] args) {

        int marks[] = new int[3]; // OR int[] marks = new int[3];

        marks[0] = 98;
        marks[1] = 92;
        marks[2] = 78;

        System.out.println("First Way of print Arrays");

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //OR
        System.out.println("Second Way of print Arrays");

        int[] markss = {45, 65, 73};

        for (int i=0; i<3; i++) {
            System.out.println(markss[i]);

        }

        System.out.println("Third Way of print Arrays get dynamic value from the User");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of Arrays:= ");
        int size = sc.nextInt();

        int number[] = new int[size];

        //intput
        for (int i=0; i<size; i++) {
            System.out.print("Please enter the value of index [" + i +"] := ");
            number[i] = sc.nextInt();
        }

        //Output
        System.out.println("___The output of Array: ___ ");
        for (int i=0; i<size; i++) {
            System.out.print("Index [" + i + "]:= ");
            System.out.println(number[i]);
        }
 
    }
}
