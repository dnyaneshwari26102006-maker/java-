 //WAP to simulate simple ATM withdrwal process 
// 1 the user enter withdrawl amount 
// 2 check if withdrawl amount is positive or negative if negative display
// withdrawl amount must be positive  
//  3 if withdrwal amount is valid check if user has sufficient balance or not if balance is
//  enough then withdrawl amount else display insufficient balance
import java.util.Scanner;
public class Bank
{
      public static void main(String args[])
      {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a withdrawl amount");
      int balance = 50000;
      int withdrwal = sc.nextInt();
      if(withdrwal>= 0)
      {
        if(withdrwal<=balance)
        {
            balance = balance - withdrwal;
            System.out.println("after withdrwal "+withdrwal+" amount updated balance =" + balance);
        }
        else{
            System.out.println("insufficient balance ");
        }
        
      }
      else
        {
            System.out.println("Enter valid Withdrwal amount.it must be positive");
      }
      }

}