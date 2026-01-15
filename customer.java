// WAP to create a class customer with data member id,mobile num,name.accept and display
//  detail of 5 customer such a customwer by name and dispaly detail of customer if found
import java.util.Scanner;
class customer
{
  int id;
  String name;
  long mobile_no;

  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter customer name");
    name=sc.nextLine();
    System.out.println("Enter customer id");
    id=sc.nextInt();
    System.out.println("Enter customer mobile no");
    mobile_no=sc.nextLong();
  }
  void display()
  {
    System.out.println("customer name is : "+name);
    System.out.println("customer id is : "+id);
    System.out.println("customer mobile no is : "+mobile_no);
  }
  public static void main(String[] args) 
  {
    boolean find = false;
    Scanner sc = new Scanner(System.in);
    
    customer[] c = new customer[5];
    for(int i =0;i<c.length;i++)
    {
      c[i]=new customer();
      c[i].accept();
    }
    System.out.println("enter the customer name to be serach");
    String n = sc.nextLine();
    for( customer x : c)
    {
      if(n.equalsIgnoreCase(x.name))
      {
        find=true;
        x.display();
      }
    }
    if(!find)
    {
      System.out.println("customer name not found");
    }
  }
}
