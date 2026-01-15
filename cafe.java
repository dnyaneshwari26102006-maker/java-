import java.util.Scanner;
public class cafe 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    char ch;
    int q;
    int cost=0;
    do
    {
        System.out.println("--------MENU-------");
        System.out.println("1.Burger :- $80");
        System.out.println("2.Pizza :- $150");
        System.out.println("3.French fries :- $60");
        System.out.println("4.Coke :- $40");
        System.out.println("5.Print bill and exit");
        System.out.println("--------------------");
        System.out.println("Enter your choice");
        ch = sc.next().charAt(0);
        switch(ch)
        {
            case '1':
                System.out.println("Enter Quantity");
                q= sc.nextInt();
                System.out.println("Your Burger Ordered Placed ");
                System.out.println(q+ "Burgers are added in your ordered");
                cost +=q*80;
                break;

            case '2':
                System.out.println("Enter Quantity");
                q= sc.nextInt();
                System.out.println("Your Pizza Ordered Placed ");
                System.out.println(q+ "Pizza are added in your ordered");
                cost +=q*150;
                break;

            case '3':
                System.out.println("Enter Quantity");
                q= sc.nextInt();
                System.out.println("Your French fries Ordered Placed ");
                System.out.println(q+ "French fries are added in your ordered");
                cost +=q*60;
                break;

            case '4':
                System.out.println("Enter Quantity");
                q= sc.nextInt();
                System.out.println("Your Coke Ordered Placed ");
                System.out.println(q+ "Coke are added in your ordered");
                cost +=q*40;
                break;

            case '5':
                System.out.println("Print bill and exit");
        }

    }while(ch!='5');
    System.out.println("=======FINAL BILL======");
    System.out.println("Total amount to Pay :" +cost);
    System.out.println("Thank you for your order");
    System.out.println("Please Visit again");
    }  
}
