import java.util.Scanner;

public class even_odd {
    public static void main(String a[]) {
        int num;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        sc.close(); 
    }
}