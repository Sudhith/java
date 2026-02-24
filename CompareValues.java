import java.util.Scanner;
public class CompareValues
{
    void compare(int a, int b) 
    {
        if (a > b) 
        {
            System.out.println("Greater integer: " + a);
        } else if (a < b) 
        {
            System.out.println("Greater integer: " + b);
        } 
        else 
        {
            System.out.println("Both integers are equal: " + a);
        }
    }

    void compare(char a, char b) 
    {
        if (a > b) 
        {
            System.out.println("Greater character: " + a);
        } 
        else if (a < b) 
        {
            System.out.println("Greater character: " + b);
        } 
        else 
        {
            System.out.println("Both characters are equal: " + a);
        }
    }

    void compare(String a, String b) 
    {
        int result = a.compareTo(b);
        if (result > 0) 
        {
            System.out.println("Greater string: " + a);
        } 
        else if (result < 0) 
        {
            System.out.println("Greater string: " + b);
        } 
        else 
        {
            System.out.println("Both strings are equal: " + a);
        }
    }

    public static void main(String[] args) {
        CompareValues obj = new CompareValues();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice to compare:");
        System.out.println("1. Integers");
        System.out.println("2. Characters");
        System.out.println("3. Strings");
        int choice = s.nextInt();
        switch (choice) 
        { case 1: 
            System.out.println("Enter 1st integer");
            int a = s.nextInt();
            System.out.println("Enter 2nd integer");
            int b = s.nextInt();
            obj.compare(a, b);
            break;
            case 2: 
            System.out.println("Enter 1st character");
            char c = s.next().charAt(0);
            System.out.println("Enter 2nd charecter");
            char d = s.next().charAt(0);
            obj.compare(c, d);
            break;
            case 3: 
            System.out.println("Enter 1st string");
            String e = s.next();
            System.out.println("Enter 2nd string");
            String f = s.next();
            obj.compare(e, f);
            break;
            default: 
            System.out.println("Invalid choice");
        }


    }
}
