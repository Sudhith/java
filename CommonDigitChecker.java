import java.util.Scanner;

public class CommonDigitChecker {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first integer (between 25 and 75): ");
        int userNum1 = s.nextInt();

        System.out.print("Enter the second integer (between 25 and 75): ");
        int userNum2 = s.nextInt();

        if (userNum1 < 25 || userNum1 > 75 || userNum2 < 25 || userNum2 > 75) {
            System.out.println("Error: Both numbers must be between 25 and 75 .");
            s.close();
            return;
        }

        int num1Tens = userNum1 / 10;
        int num1Units = userNum1 % 10;

        int num2Tens = userNum2 / 10;
        int num2Units = userNum2 % 10;

        if (num1Tens == num2Tens ||
            num1Tens == num2Units ||
            num1Units == num2Tens ||
            num1Units == num2Units) {
            System.out.println("Result: True! The numbers " + userNum1 + " and " + userNum2 + " share a common digit.");
        } else {
            System.out.println("Result: False! The numbers " + userNum1 + " and " + userNum2 + " do not share a common digit.");
        }

        s.close();
    }
}
