import java.util.Scanner;
public class loopExp
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // int i=0,j=1;
        // for(i=0,j=1;i>=j;i++,j++)
        // {
        //     System.out.println(i+(j));
        // }
        // Ask user to enter num between 1 to 10

        // int n;
        // do 
        // {
        //     System.out.println("Enter a num between 1-10");
        //      n = sc.nextInt();
        // }while(n<1 || n>10);
        // System.out.println("you entered this num" +n);

        // WAP to ask user to enter positive number and calculate sum of positive number if user enter negative number then exit from program

        // int num=0,sum=0;
        // do{

        // sum=sum+num;
        //     System.out.println("Enter a number");
        //     num = sc.nextInt();
            

        // }while(num>=0);
        // System.out.println("the number is negative");
        // System.out.println(sum);

        // calculate add of two num until user press no

        // int n1,n2;
        // int add;
        // char c;
        // do
        // {
        //     System.out.println("Enter a two number");
        //     n1=sc.nextInt();
        //     n2=sc.nextInt();
        //     add=n1+n2;
        //     System.out.println("Addition of two numbers"+add);
        //     System.out.println("Do you want continue(Y/y)");
        //     c =sc.next().charAt(0);
        // } while(c=='Y'|| c=='y');
        // System.out.println("out of loop");

    // menu driven program
    char ch;
    do
    {
        System.out.print("1.Area of rectangle\n2.Area of triangle\n3.Area of square\n4. Area of circle\nQ.Quit\n");
        System.out.println("Enter your choice");
        ch = sc.next().charAt(0);

        switch(ch)
        {
            case '1':
                System.out.println("Enter a length and breadth");
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Area of rectangle is : " + (l * b));
                break;

            case '2':
                System.out.println("Enter height and base");
                float h = sc.nextFloat();
                float b1 = sc.nextFloat();
                System.out.println("Area of triangle is : " + (0.5 * b1 * h));
                break;

            case '3':
                System.out.println("Enter a side");
                int s = sc.nextInt();
                System.out.println("Area of square : " + (s * s));
                break;

            case '4':
                System.out.println("Enter a radius");
                float r = sc.nextFloat();
                System.out.println("Area of circle" + (3.14 * r * r));
                break;

            case 'Q':
            case 'q':
                System.out.println("Quite");
                break;

            default:
                System.out.println("enter a valid choice");
        }

    }while(ch!='Q' && ch!='q');


        

    }
    
    
}
