import java.util.Scanner;
public class le1 
{
    public static void main(String[] a)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter property value");
        double d = s.nextDouble();
        System.out.println("Enter region");
        char c = s.next().charAt(0);
        if(c == 'u')
        {
            double pt = d * 0.03;
            System.out.println(pt);

        }
        else if (c == 's')
        {
            double pt = d * 0.02;
            System.out.println(pt);

        }
        else if(c == 'r')
        {
            double pt = d * 0.01;
            System.out.println(pt);
        }
        else
        {
            System.out.println("Invalid");
        }
        s.close();


    }
    
}
