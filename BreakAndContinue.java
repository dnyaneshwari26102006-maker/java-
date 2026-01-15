
import java.util.Scanner;

/*In java break and continue are loop control statement
They change the normal flow of loop (for,while,do-while) and are also used with switch.
break: 1)stop the loop completely
        2)control jump outside the loop
continue: 1)skip the current iteration
            2)loop continues with the next iteration */
            public class BreakAndContinue 

{
    public static void main(String[] args)
    {
    //  for(int i=1;i<=10;i++)
    //  {
    //     if(i==5)
    //     {
    //         break;
    //     }
    //     System.out.println(i +" ");
    //  }  
     
    // //  continue example

    // for(int i=1;i<=5;i++)
    // {
    //     if(i==3)
    //     {
    //         continue;
    //     }
    //     System.out.println(i +" ");
    // }
    Scanner sc =new Scanner(System.in);
        // WAp to take 10 number from user if num is negative stop accepting from user
    
       
    // for(int i =1;i<=10;i++)
    // {
    //      System.out.println("Enter a number");
    //     int n = sc.nextInt();
    //     if(n<0)
    //     {
    //         break;
    //     }
    //     System.out.println(n);
    // }

        // WAP to accept first 20 even numbers
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter a num");
            int num = sc.nextInt();
            if(num>40 || num%2!=0)
            {
                System.out.println("enter num between 1-40 and even number");
              continue;  
            }
            System.out.println(num);
        }


    }
}
