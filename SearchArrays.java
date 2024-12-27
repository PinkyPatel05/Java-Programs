import java.util.Scanner;

public class SearchArrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of Arrays:= ");
        int size = sc.nextInt();

        int number[] = new int[size];

        //intput
        for (int i=0; i<size; i++) {
            System.out.print("Please enter the value of index [" + i +"] := ");
            number[i] = sc.nextInt();
        }

        System.out.print("Please enter the value You want to search in the Array:= ");
        int x = sc.nextInt();

        //Output

        for (int i=0; i<number.length; i++) {
            if(number[i] == x) {
                System.out.println("I found the number of Index[" + i + "]");
            }            
        }
    }
}
