class Demo1 
{
  int x;
  void display()
  {
    System.out.println("hello from display function");
  }
  void display1(String s)
  {
    System.out.println("hello from display1 function");
  }
  int f1()
  {
    return 10+20;
  }
  int f2(int a)
  {
    return a*10;
  }
}
public class Demo
{
  public static void main(String[] args) 
  {
    Demo1 d = new Demo1();
    System.out.println("From main : "+d.x);
    d.x=20;
    System.out.println("From main : "+d.x);
    Demo1 d1 = new Demo1();
    System.out.println(d1.x);
    d.display();
    d.display1("hello");
    int c=d.f1();
    System.out.println(c);
    int b = d.f2(10);
    System.out.println(b);

    // WAP to create class student with property name roll num college name phone no.create 
    // an instance method to get all details of student named as get details and create one 
    // function to print all details of student named as print details.

    
  }
} 
