import java.util.Scanner;
public class Arr_Q3
{
    public static void main(String[] a)
    {
        int odds = 0;
        int evens = 0;
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println("Enter "+i+"th number of array");
            arr[i] = s.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                evens += arr[i];
            }
            else
            {
                odds += arr[i];

            }
        }
        System.out.println("Sum of odd indexes is : "+ odds);
        System.out.println("Sum of even indexes is : "+ evens);

    }

}
    

