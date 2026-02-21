import java.util.Scanner;
public class le2 
{
    int f = 1;
    int read()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
         return n;
    }
    void calculate()
    {
        int n1 = read();
        for(int i = 1; i<=n1;i++)
        {
            f = f*i;
        }
        
    }
    void display()
    {
        System.out.println("Factorial is : " + f);
    }
    public static void main(String[] a)
    {
        le2 obj = new le2();
        obj.calculate();
        obj.display();
    }
   
    
}
