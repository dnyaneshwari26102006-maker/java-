public class nestedloopExp 
{
    public static void main(String args[])
    {
        
        
        // int i=0;
        // int j=0;
        // for(i=0;i<3;i++)
        // {
        //     for(j=0;j<3;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Number pattern

        // int i=0;
        // int j=0;
        // for(i=0;i<3;i++)
        // {
        //     for(j=0;j<3;j++)
        //     {
        //         System.out.print(i+1);
        //     }
        //     System.out.println();
        // }

        // int i=0;
        // int j=0;
        // for(i=0;i<3;i++)
        // {
        //     for(j=0;j<3;j++)
        //     {
        //         System.out.print(j+1);
        //     }
        //     System.out.println();
        // }

        // left half pryamid

        // int i=0;
        // int j=0;
        // for(i=0;i<3;i++)
        // {
        //     for(j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //     1
        //     1 2
        //     1 2 3
        //     1 2 3 4

        // int i=1;
        //  int j=1;
        //  for(i=1;i<=4;i++)
        //  {
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4

        // int i=1;
        //  int j=1;
        //  for(i=1;i<=4;i++)
        //  {
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // 4
        // 3 3 
        // 2 2 2
        // 1 1 1 1
        // // int i=4;
        // //  int j=1;
        // //  for(i=4;i>=0;i--)
        // //  {
        // //      for(j=4;j>=i;j--)
        // //     {
        // //         System.out.print(i);
        // //     }
        // //     System.out.println();
        // }

        // 4 
        // 4 3
        // 4 3 2
        // 4 3 2 1

       //  // // int i=4;
        // //  int j=1;       
         //    for(i=4;i>=1;i--)
        // //  {
      // //      for(j=1;j>=i;j--)
        // //     {
        // //         System.out.prijt(j);
        // //     }
        // //     System.out.println();
        // // }
         
        
    //       *
    //     * *
    //    * * *

    // int i=1;
    //      int j=1;
    //      int k=1;
    //      for(i=1;i<=3;i++)
    //      {
    //         for(k=1;k<=3-i;k++)
    //         {
    //             System.out.print("@");
    //         }
    //          for(j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
         
        
    //          4
        //     43
        //    432
        //   4321

    int i=4;
         int j=4;
         int k=1;
         for(i=4;i>=1;i--)
         {
            for(k=1;k<i;k++)
            {
                System.out.print("-");
            }
             for(j=4;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        // ***
        // **
        // *

        // int i=3;
        // int j=1;
        // for(i=3;i>=1;i--)
        // {
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4321
        // 432
        // 43
        // 4

        // int i=1;
        // int j=1;
        // for(i=1;i<=4;i++)
        // {
        //     for(j=4;j>=i;j--)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // ****
        //  ***
        //   **
        //    *

        
        // int i=4;
        // int j=1;
        // int k=1;
        //  for(i=4;i>=1;i--)
        //  {
        //     for(k=1;k<=4-i;k++)
        //     {       
        //         System.out.print("@");
        //     }
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // pryamid pattern

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

        // // equilateral triangle

        // int i=1;
        // int j=1;
        // int k=1;
        //  for(i=1;i<=4;i++)
        //  {
        //     for(k=1;k<=4-i;k++)
        //     {       
        //         System.out.print(" ");
        //     }
        //      for(j=1;j<=i;j++)
        //     {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        

        


    }
}