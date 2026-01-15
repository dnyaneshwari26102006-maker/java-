public class static_variable 
{
  static int count;
  void f1()
  {
    count++;
    System.out.println(count);
  }
  public static void main(String[] args) 
  {
    static_variable s1 = new static_variable();
    static_variable s2 = new static_variable();
    static_variable s3 = new static_variable();
    s1.f1();
    s2.f1();
    s3.f1();

    System.out.println("final count : "+count);
  }
}
