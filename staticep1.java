
import java.util.Scanner;

// WAP to create a class student with data members id,name,marks and one common data member all student college name
// accept and display data for student
class staticep1
{
  static String college_name="scsmcoe";
  int id;
  String name;
  float marks;

  void accept()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student name : ");
    name = sc.nextLine();
     System.out.println("Enter student id : ");
    id = sc.nextInt();
     System.out.println("Enter student marks : ");
    marks = sc.nextFloat();

  }

  void display()
  {
    System.out.println(" student name  is: "+name);
    System.out.println(" student id is : "+id);
    System.out.println(" student marks is : "+marks);
    System.out.println("student college name is  : "+college_name);
  }
  public static void main(String args[])
  {
    staticep1 s = new staticep1();
    s.accept();
    s.display();
    staticep1 s1 = new staticep1();
    s1.accept();
    s1.display();
  }
}