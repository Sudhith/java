
import java.util.Scanner;
public class Unit_1_Q_4 
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            count += digit;
            number /= 10;
            
        }
        if(count == 0)
        {
            System.out.println("Sunday");
        }
        else if (count == 1)
        {
            System.out.println("Monday");
        }
        else if (count == 2)
        {
            System.out.println("Tuesday");
        }
        else if (count == 3)
        {
            System.out.println("Wednesday");
        }
        else if (count == 4)
        {
            System.out.println("Thursday");
        }
        else if (count == 5)
        {
            System.out.println("Friday");
        }
        else if (count == 6)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("invalid");
        }
        s.close();
    }
}
