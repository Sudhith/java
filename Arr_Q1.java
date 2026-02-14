import java.util.Scanner;

public class Arr_Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + "th integer:");
            arr[i] = s.nextInt();
        }

        System.out.println("Displaying using for loop:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("Displaying using for-each loop:");
        for (int num : arr) 
        {
            System.out.println(num);
        }

        s.close();
    }
}


        
