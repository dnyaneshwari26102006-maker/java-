
//WAP to check given number is prime or not
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int count = 0, i=1;
        // for(i=1;i<=n;i++)
        // {
        // if(n%i==0)
        // count++;
        // }
        // if(count==2)
        // System.out.println("number is prime");
        // else
        // System.out.println("number is not prime");

        // WAP to check given number is strong or not(145->1!+4!+5!)

        // System.out.println("enter a number");
        // int num = sc.nextInt();
        // int r=0, i;
        // int fact;
        // int sum=0,temp=num;

        // while(num!=0)
        // {
        // r=num%10;
        // fact=1;
        // for(i=r;i>=1;i--)
        // {
        // fact = fact*i;
        // }
        // sum = sum+fact;
        // num =num/10;

        // }
        // System.out.println(sum);
        // if(temp==sum)
        // {
        // System.out.println("given number " + temp + "is strong");
        // }
        // else{
        // System.out.println("number is not strong");
        // }

        // WAP to check given num is perfect num or not

        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int i,sum=0;

        // for(i=1;i<n;i++)
        // {
        // if(n%i==0)
        // sum = sum + i;
        // }
        // if(n==sum)
        // {
        // System.out.println("number is perfect");
        // }
        // else{
        // System.out.println("number is not perfect");
        // }

        // WAP to print fibonacci

        int n = 8;
        int i;
        int n1 = 0, n2 = 1, n3;
        for (i = 0; i < n; i++) {
            System.out.println(n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
