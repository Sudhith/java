import java.util.Scanner;
public class Arr_Q11 
{
    public static void main(String[] a)
    {
        // Program to read and print a 2 dimensional array.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        // Print the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}