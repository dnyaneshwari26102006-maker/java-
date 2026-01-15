// for loop
// for(intialization;condition;increment or decrement operation)
// {
// //block of statement
// }

// WAP to print first 100 natural number in decending order using for loop
import java.util.Scanner;

class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int i;
        // for(i=100;i>=1;i--)
        // {
        // System.out.println(i);
        // }

        // WAP to calculate sum of first n natural number using for loop

        // System.out.println("Enter value of n");
        // int n = sc.nextInt();
        // int sum=0,i;
        // for(i=1;i<=n;i++)
        // {
        // System.out.println(i);
        // sum += i;
        // }
        // System.out.println(sum);

        // WAP to find factorial of given number

        // System.out.println("Enter a value");
        // int num = sc.nextInt();
        // int fact=1,i;
        // for(i=num;i>=1;i--)
        // {
        // fact = fact*i;

        // }
        // System.out.println("factorial num is :" + fact);

        // WAP to print multiplication table of given number

        // System.out.println("enter a number");
        // int n = sc.nextInt();
        // int i;
        // for(i=1;i<=10;i++)
        // {
        // System.out.println(n+" * "+i+" = "+(n*i));
        // }

        // WAP to print even numbers upto n using for loop

        // System.out.println("enter value of num");
        // int num = sc.nextInt();
        // int i;
        // for (i = 1; i <= num; i++) {
        // if (i % 2 == 0)
        // System.out.println(i);
        // }

        // WAP to print sum of given series

        // System.out.println("enter value of n");
        // int n = sc.nextInt();
        // int sum = 0, i = 1;
        // for (i = 1; i <= n; i++) {
        // sum += i * i;
        // }
        // System.err.println("Sum of the series is :" + sum);

        System.out.println("enter value of n");
        int n = sc.nextInt();
        float sum = 0, i = 1;
        for (i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        System.err.println("Sum of the series is :" + sum);

    }
}