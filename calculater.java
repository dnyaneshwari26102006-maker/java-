
//calculater with switch case
import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a operator(+,-,*,/,%)");
        char c = sc.next().charAt(0);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        switch (c) {
            case '+':
                System.out.println("addition is " + (num1 + num2));
                break;

            case '-':
                System.out.println("subtraction is " + (num1 - num2));
                break;

            case '*':
                System.out.println("multiplication is " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println("division is " + (num1 / num2));
                else
                    System.out.println("second num can't be zero");
                break;

            case '%':
                System.out.println("Modules is " + (num1 % num2));
                break;

            default:
                System.out.println("Enter a valid operator");

        }
    }

}
