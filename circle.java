import java.util.Scanner;
public class circle 
{
    
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    float area;
    float p = 3.14f;
    System.out.println("Enter a radius value");
    float r = sc.nextFloat();
    area = p*r*r;
    System.out.println("area of circle"+area);
   } 
}
