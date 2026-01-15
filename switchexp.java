 //WAP to convert single digit number into words using switch case
import java.util.Scanner;
public class switchexp
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int num = sc.nextInt();
    switch(num)
    {
        case 1:
            System.out.println("one");
            break;

        case 2:
            System.out.println("Two");
            break;

        case 3:
            System.out.println("Three");
            break;
            
        case 5:
            System.out.println("Five");
            break;

        case 6:
            System.out.println("Six");
            break;

        case 7:
            System.out.println("seven");
            break;

        case 8:
            System.out.println("eight");
            break;

        case 9:
            System.out.println("nine");
            break;

        default:
            System.out.println("enter valid num");
    

    }
  }  
}