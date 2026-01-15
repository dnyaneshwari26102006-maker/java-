public class thisexp 
{
  int a,b;
  void setdata(int a,int b)
  {
    this.a=a;
    this.b=b;
    show();
  }
  void show()
  {
    System.out.println("value of a and b "+(a)+(b));
  }
  public static void main(String args[])
  {
    thisexp t = new thisexp();
    t.setdata(10,20
    );

  }
}
