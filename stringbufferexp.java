
import java.util.Scanner;

public class stringbufferexp 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    // StringBuffer s = new StringBuffer();
    // System.out.println("Intial capacity of string 1 : "+s.capacity());
    // System.out.println("length of the string : "+s.length());

    // StringBuffer s2 = new StringBuffer(100);
    // System.out.println("Intial capacity of string 1 : "+s2.capacity());
    // System.out.println("length of the string : "+s2.length());

    // StringBuffer s1 = new StringBuffer("java");
    // System.out.println("capacity: "+s1.capacity());
    // System.out.println("length of the string : "+s1.length());

    // s1.append("program");
    // System.out.println("capacity "+s1.capacity());
    // s1.append("123456789");
    // System.out.println("length: "+s1.length());
    // System.out.println("capacity : "+s1.capacity());

    // s1.insert(2,"@");
    // System.out.println(s1);

    // System.out.println("charAt(index): "+s1.charAt(2));

    // s1.setCharAt(2,'*');
    // System.out.println("setcharAt(index,character): "+s1);

    // s1.deleteCharAt(2);
    // System.out.println("deletecharAt(index): "+s1);

    // s1.delete(2,5);
    // System.out.println("delete(start,end): "+s1);

    // // stringbuffer change original string

    // StringBuffer s3 = new StringBuffer("java");
    // StringBuffer s4 = new StringBuffer("java");
    // System.out.println(s3.equals(s4));
    // // in stringbuffer class equals method check the referance of given string.
    // // System.out.println(s3.repeat(s3,3));

    // System.out.println(s3.indexOf("a"));
    // System.out.println(s3.lastIndexOf("a"));

    // s3.replace(0,3,"hola");
    // System.out.println(s3);
    // s3.reverse();
    // System.out.println(s3);

    // s3.setLength(3);
    // System.out.println(s3);

    // System.out.println(s3.append("10"));

    // String var4 = s3.toString();
    // System.out.println("string: "+s3.toString());

    // WAP to check given string is palidrome or not using stringbuffer.
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    StringBuffer sb = new StringBuffer(str);
    sb.reverse();
    if (str.equals(sb.toString())) 
    {
      System.out.println("The given string is a Palindrome");
    } 
    else 
    {
      System.out.println("The given string is NOT a Palindrome");
    }

  }
}
