import java.util.Scanner;

public class MiniATM 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in); 
       int pin=1234,p;
       char ch;
       int atemp=1;
       int balance=10000;
       boolean b=false;
       System.out.println("====Welcome to Mini ATM====");
        while(atemp<=3)
       {
        System.out.println("Enter Your Pin");
        p=sc.nextInt();
        if(p==pin)
        {
            System.out.println("PIN correct! Access granted ");
            b=true;
            break;
        }
        else 
        {
            System.out.println("Incorrect PIN Attempt Left: "+(3-atemp));
            atemp++;
        }
        
       }
       if(b)
       {

       
       do 
       { 
          System.out.println("====ATM Menu====");
          System.out.println("1)Check Balance");
          System.out.println("2)Deposite Money");
          System.out.println("3)Withdraw Money");
          System.out.println("Q)Quit");
          System.out.println("Enter your choice");
          ch = sc.next().charAt(0);
          switch(ch)
          {
            case '1':
                System.out.println("Current Balance : "+balance);
                break;

            case '2':
                int deposite;
                System.out.println("Enter amount to deposite : ");
                deposite = sc.nextInt();
                if(deposite>0){
                balance = balance+deposite;
                System.out.println("Deposite successful! New Balance : "+balance);}
                else{
                    System.out.println("please enter valid amount");
                }
                break;

            case '3':
                int withdraw;
                System.out.println("Enter amount to withdraw");
                withdraw = sc.nextInt();
                if(withdraw>0 && withdraw<balance && balance-withdraw>1000){
                balance = balance-withdraw;
                System.out.println("withdrawal successful! New balance : "+balance);}
                else 
                {
                    System.out.println("amount should be positive or less than balance or insufficient balance");
                }
                break;

            case 'Q':
            case 'q':
                System.out.println("Thank you using mini ATM goodbye");

            default:
                System.out.println("Enter valid choice");
          }
           
       } while (ch!='Q' && ch!='q');}
       else{
        System.out.println("to many incorrect attempt exit from program");
       }
    }
}

