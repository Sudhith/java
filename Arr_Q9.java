import java.util.Scanner;
public class Arr_Q9
{
    public static void main(String[] a)
    {
        // Program to delete duplicate elements from an array of size 5
        Scanner s = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter " + i + "th number of array:");
            arr[i] = s.nextInt();
        }
        // Delete duplicate elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // Shift elements to the left
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--; // Reduce array size
                    j--; // Check the new element at index j
                }
            }
        }
        // Print the array after deleting duplicates
        System.out.println("Array after deleting duplicates:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
