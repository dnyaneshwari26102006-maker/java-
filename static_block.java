public class static_block 
{
  static int x;
  static {
    x=100;
    System.out.println("static block executed");
  }
  public static void main(String args[])
  {
    System.out.println("main method");
    System.out.println(x);
  }
}
