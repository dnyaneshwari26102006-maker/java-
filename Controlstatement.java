import java.util.Scanner;
public class Controlstatement 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x =20;
        if(x>=20)
        {
            System.out.println("number is greater than 20");
        }
        System.out.println("End");

        // //WAP to take integer value from user and check wheather this value equal to 100 or not
        System.out.println("Enter a value");
        int a = sc.nextInt();
        if(a==100)
        {
            System.out.println("value is equal to 100");
        }
        System.out.println("value not equal to 100");
        
        // WAP to check given number is positive or negative

        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println(n+"number is positive");
        }
        else{
            System.out.println(n+" number is negative");
        }
        // WAP to check given number is even or odd 
        System.out.println("Enter a number ");
        int n1 = sc.nextInt();
        if(n1%2==0)
        {
            System.out.println(n1+ "num is even");
        }
        else
        {
            System.out.println(n1+ "num is odd");
        }
        //WAP to check given shape is square or rectangle

        System.out.println("enter a length");
        int l = sc.nextInt();
        System.out.println("enter a breadth");
         int b = sc.nextInt();
        if(l==b)
        {
            System.out.println("this is square");
        }
        else 
        {
            System.out.println("this is rectangle");
        }
        //WAP to check enter number is multiple of 8 or not

        
        else{
            System.out.println("not multiple");
        }
        //WAP to check given num is betweeen 100 and 500 if else then print is an between 100 to 500
        //otherwise not in between 100 to 500
        System.out.println("enter a num");
        int n3 = sc.nextInt();
        if(n3>=100 && n3<=500 )
        {
            System.out.println("Number is between 100 to 500");
        }
        else{
            System.out.println("num is not between 100 to 500");
        }

    }
}
