
// WAp to calculate area of shape on user choice
import java.util.Scanner;

public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Area of rectangle\n2.Area of triangle\n3.Area of square\n4. Area of circle\n");
        System.out.println("Enter your choice");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Enter a length and breadth");
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Area of rectangle is : " + (l * b));
                break;

            case 2:
                System.out.println("Enter height and base");
                float h = sc.nextFloat();
                float b1 = sc.nextFloat();
                System.out.println("Area of triangle is : " + (0.5 * b1 * h));
                break;

            case 3:
                System.out.println("Enter a side");
                int s = sc.nextInt();
                System.out.println("Area of square : " + (s * s));
                break;

            case 4:
                System.out.println("Enter a radius");
                float r = sc.nextFloat();
                System.out.println("Area of circle" + (3.14 * r * r));
                break;

            default:
                System.out.println("enter a valid choice");

        }

    }
}