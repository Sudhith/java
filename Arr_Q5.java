import java.util.Scanner;
public class Arr_Q5 
{
    public static void main(String[] a)
    {
        //Program to find Maximum and minimum value in an array of size “M”, passed as argument
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int m = s.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter " + m + " elements:");
        for (int i = 0; i < m; i++) {
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < m; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
    }
    
}
