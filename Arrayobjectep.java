// WAP to define class empolyee having data member id,name,salary accept and display data for
// 4 empolyee.
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
class empolyee
{
  int id ;
  String name;
  float salary;
  

  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a emp name : ");
    name = sc.nextLine();
    System.out.println("Enter a emp id : ");
    id = sc.nextInt();
    
    System.out.println("Enter a emp salary : ");
    salary = sc.nextFloat();
  }
  void display()
  {
    System.out.println("emp id is : "+id);
    System.out.println("emp name  is : "+name);
    System.out.println("emp salary is : "+salary);
  }
}
public class Arrayobjectep
{
  public static void main(String[] args) 
  {
    int count=0;
     empolyee[] emp = new empolyee[4];
     for(int i=0;i<emp.length;i++)
     {
      System.out.println("Enter the detail of emp "+(i+1));
      emp[i]=new empolyee();
      emp[i].accept();
      
     } 
     
     for(empolyee e : emp)
     {
       System.out.println("Details of 4 Empolyee");
      if(e.salary>50000)
      {
     
      count++;
     }
     e.display();
      System.out.println("_______________________");}
     
     System.out.println("the total of emp having salary is greater than 500000"+count);
  }
}