
import java.util.Scanner;
public class Unit_1_Q_5
 {
    public static void main(String[] a) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float n1 = s.nextFloat();
        System.out.print("Enter second float number: ");
        float n2 = s.nextFloat();
        if (n1 * 1000 == n2 * 1000)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        s.close();

    }
    
    
}
