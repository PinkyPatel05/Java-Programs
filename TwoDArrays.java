import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows you want:= ");
        int rows = sc.nextInt();
        System.out.print("Enter how many cols you want:= ");
        int cols = sc.nextInt();

        // declare array
        int[][] numbers = new int[rows][cols];

        // input
        for (int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt(); 

            }        
        }

        // output
        for (int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.println(numbers[i][j] + " ");
            } 
            System.out.println();       
        }

    }
}
