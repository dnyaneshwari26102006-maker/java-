import java.util.Scanner;
public class Add 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n1");
        int n1 = sc.nextInt();
        System.out.println("Enter value of n2");
        int n2 = sc.nextInt();
        int res;
        res=n1+n2;
        System.out.println("Addition of two number are :-"+ res);
        
        if(n1==n2)
        {
            System.out.println("sum of two number is triple"+res*3);
        }
        else{
            System.out.println("sum of two num is :-"+res);
        }
    }
}
