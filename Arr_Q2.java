import java.util.Scanner;
public class Arr_Q2 
{
    public static void main(String[]a)
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array:");
        n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length;i++)
        {
            System.out.println("Enter "+(i+1)+"th number of array");
            arr[i] = s.nextInt();
        }
        int odds = 0;
        int evens = 0;
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                evens+=arr[i];
            }
            else
            {
                odds+=arr[i];
            }

        }
        System.out.println("Sum of odd numbers is : "+ odds);
        System.out.println("Sum of even numbers is : "+ evens);
    }
    
}
