//WAP to take num from user and check num is positive or negative if it is positive then check  even or not only if it a even then print cube of given number else print square of given number
import java.util.Scanner;
public class nested
 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int num = sc.nextInt();
       if(num>=0)
        {
        if(num%2==0)
        {
            System.out.println("number is even and cube of given num is "+num*num*num);
        } 
        else
            {
                System.out.println("number is odd and Square of given number"+num*num);
            }
       }
       else
        {
        System.out.println("num is negative");
        }
       
      
}
