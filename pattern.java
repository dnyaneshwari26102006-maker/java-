import java.util.Scanner;
public class pattern

{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //  int i=1;
        //  int j=1;
        //  int k=1;
        //  for(i=1;i<=3;i++)
        //  {
        //     for(k=1;k<=3-i;k++)
        //     {
        //         System.out.print("@");
        //     }
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // diamond 

        // int i=1;
        // int j=1;
        // int k=1;
        //  for(i=1;i<=3;i++)
        //  {
        //     for(k=1;k<=3-i;k++)
        //     {       
        //         System.out.print(" ");
        //     }
        //      for(j=1;j<=2*i-1;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(i=2;i>=1;i--)
        //  {
        //     for(k=1;k<=3-i;k++)
        //     {       
        //         System.out.print(" ");
        //     }
        //      for(j=1;j<=2*i-1;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 1
        // 23
        // 456
        // 78910

        // int i=1;
        // int j=1;
        // int n=1;
        //  for(i=1;i<=4;i++)
        //  {
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(n);
        //         n++;
        //     }
        //     System.out.println();
        //  }

        //  character pattern
        // AAA
        // BBB
        // CCC

        // char ch='A';
        // int i=1;
        // int j=1;

        // for(i=1;i<=3;i++)
        // {
        //     for(j=1;j<=3;j++)
        //     {
        //         System.out.print(ch);
        //     }
        //     ch++;
        //     System.out.println();
        // }

        // AAAA
        //  BBB
        //   CC
        //    D

        // int i=4;
        // int j=1;
        // int k=1;
        // char ch='A';
        //  for(i=4;i>=1;i--)
        //  {
        //     for(k=1;k<=4-i;k++)
        //     {       
        //         System.out.print(" ");
        //     }
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(ch);
        //     }
        //     ch++;
        //     System.out.println();
        // }


        // a
        // bc
        // def
        // ghij

        //  int i;
        // int j=1;
        // int n;
        // char ch='a';
        // System.out.println("Enter num of rows");
        // n = sc.nextInt();
        //  for(i=1;i<=n;i++)
        //  {
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(ch);
        //         ch++;
               
        //     }
            
        //     System.out.println();
        //  }

    //      A 
    //     A B 
    //    A B C 
    //   A B C D

        // int i,n;
        // int j=1;
        // int k=1;
        // char ch='A';
        // System.out.println("Enter num of rows");
        // n= sc.nextInt();
        //  for(i=1;i<=n;i++)
        //  {
        //     for(k=1;k<=n-i;k++)
        //     {       
        //         System.out.print(" ");
        //     }
        //     ch='A';
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // A
        // bC
        // dEf
        // GhIj

        // int i=1;
        // int j=1;
        // char ch='A';
        //  for(i=1;i<=4;i++)
        //  {
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(ch);
        //         if(ch>='A' && ch<='Z')
        //         {
        //             ch=(char) (ch+32);
        //         }
        //         else if(ch>='a' && ch<='z')
        //         ch=(char)  (ch-32);
        //         ch++;
               
        //     }
        //     System.out.println();
        //  }

        // A
        // AB
        // ABC
        // ABCD
        // ABC
        // AB
        // A

        int i=1;
        int j=1;
        char ch='A';

        for(i=1;i<=4;i++)
        {
            ch='A';
            for(j=1;j<=i;j++)
            {
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }

        for(i=3;i>=1;i--)
        {
             ch='A';
            for(j=1;j<=i;j++)
            {
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}