import java.util.Scanner;
public class Arr_Q12 
{
    public static void main(String[] a)
    {
        // Program to find the sum of 2 matrices.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = s.nextInt();
        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
        // Find the sum of the two matrices
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        // Print the sum matrix
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
