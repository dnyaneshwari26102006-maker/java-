
import java.util.Scanner;

/*1.in java string is an non primitive data type
2.string is a class in java.string is nothig but sequance of charcter or array of character
3.in java string object are immutable(non changeble).
4.to create a string there are 3 classes in java 1.String,2.StringBuffer,3.StringBuilder*/
class StringExp
{
  public static void main(String[] args) 
  {
    // String s1="Dnyanu"; //Compile time intilization
    // System.out.println(s1);

    // String s2 = new String("java");
    // System.out.println(s2);

    // byte[] b={97,98,99,100,101};
    // char[] c={'A','B','C','D','E'};
    // int[] u={99,98,97,100,101};

    // // method 1
    // String s3 = new String(b);
    // System.out.println("Method 1:"+s3);

    // // method 2
    // String s4 = new String(b,1,3);
    // System.out.println("Method 2:"+s4);

    // // method 3
    // String s5 = new String(c);
    // System.out.println("Method 3:"+s5);

    // // method 4
    // String s6 = new String(c,1,3);
    // System.out.println("Method 4:"+s6);

    // // method 5
    // String s7 = new String(u,1,3);
    // System.out.println("Method 5:"+s7);

    // WAP to take student info from user.(roll,name,coll name,mobile no,email add,add).

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a student name:");
    String s1 = new String();
    s1=sc.nextLine();
    System.out.println("Enter roll num:");
    int roll = sc.nextInt();
    sc.nextLine();
    System.out.println("enter a college name");
    String s2 = new String();
    s2 = sc.nextLine();
    // sc.nextLine();
    System.out.println("Enter a mobile num :");
    long mb = sc.nextLong();
    sc.nextLine();
    System.out.println("Enter email address:");
    String s3 = new String();
    s3 = sc.nextLine();
    // sc.nextLine();
    System.out.println("Enter address");
    String s4 = new String();
    s4 = sc.nextLine();

    System.out.println("-----Student Info-----");
    System.out.println("Roll num is:"+roll);
    System.out.println("Name is:"+s1);
    System.out.println("College name is:"+s2);
    System.out.println("mobile num is:"+mb);
    System.out.println("email add is:"+s3);
    System.out.println("address is:"+s4);

    



  }
}