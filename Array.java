import java.util.Scanner;
import javax.xml.crypto.NoSuchMechanismException;
public class Array 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
    // Declare an array with literals
   //  int[] roll = {1,2,3,4,5,6};
   //  // declare an array and create an array
   //  float[] a= new float[5];

   //  // Initialize array
   //  a[0]=12;
   //  a[1]=4;
   //  a[2]=5;
   //  a[3]=10;
   //  a[4]=20;
    
   //  // access each array elements
   //  System.out.println("Accessing element of array");
   //  System.out.println(a);
   //  System.out.println("first element :" +a[0]);
   //  System.out.println("second element :" +a[1]);
   //  System.out.println("third element :" +a[2]);
   //  System.out.println("forth element :" +a[3]);
   //  System.out.println("fifth element :" +a[4]);

   // WAP to count total num of even or odd element in given array
      // System.out.println("Enter the total num of element in array ");
      // int n = sc.nextInt();
      // int array[] = new int[n];
      // int ecount=0,ocount=0;
      // System.out.println("Enter array element");
      // for (int i = 0; i < array.length; i++)
      // {
      //       array[i]=sc.nextInt();
      //       if(array[i]%2==0)
      //       {
      //          ecount++;
      //       }
      //       else
      //       {
      //          ocount++;
      //       }
          
      // }
      // System.out.println("even count =" +ecount);
      // System.out.println("odd count = " +ocount);
      
      // WAP to accept 5 employee salary from user and calculate total salary and average of salary of 5 employee
       
      // float array[]= new float[5];
      // System.out.println("enter salary of 5 employee");
      // float sum=0,avg;
      // for(int i=0;i<5;i++)
      // {
      //     array[i] = sc.nextFloat();
      //     sum = sum + array[i];
          
      // }
      // System.out.println("Sum= " +sum);
      // avg=sum/5;
      // System.out.println("average is =" +avg);

      // WAP to find min and max element from array

      // int arr[] = new int[5];
      // System.out.println("enter the element");
      // for(int i=0;i<5;i++)
      // {
      //    arr[i] = sc.nextInt();
         
      // }
      // int min=arr[0],max=arr[0];
      // for(int i=0;i<5;i++)
      // {
      //    if(arr[i]>max)
      //    {
      //       max = arr[i];
      //    }
      //    if(arr[i]<min)
      //    {
      //       min=arr[i];
      //    }
      // }
      // System.out.println("minimun value :" +min);
      // System.out.println("maximum value : " +max);

      // WAP to reverse a given array
      
      // int a[]={100,40,30};
      //  for(int i = a.length-1; i>=0 ; i--)
      // {
      //    System.out.println(a[i]);
      // }

      // WAP to copy one array into another array
      // int a[]={1,2,3,4,5};
      // int b[]=new int[a.length];

      // for(int i=0;i<a.length;i++)
      // {
      //    b[i] = a[i];
      // }
      // System.out.println("copied array");
      // for(int i=0; i<b.length;i++)
      // {
      //    System.out.println(b[i] +" ");
      // }

      // WAP to merge two array and store in third one

      // int a[] = {1,2,3};
      // int b[] = {4,5,6};
      // int c[] = new int[a.length+b.length];

      // for (int i = 0; i<a.length; i++)
      // {
      //    c[i]= a[i];
      // }
      // for(int i=0;i<b.length;i++)
      // {
      //    c[a.length+i]=b[i];

      // }
      // for(int d:c)
      // {
      //    System.out.println(d);
      // }

      // WAP to search given number in an array if num is found then return index of element then return -1
      // int a[] = new int[5];
      // int f=-1;
      // System.out.println("''Enter array element");
      // for(int i=0 ; i<a.length;i++)
      // {
      //    a[i]=sc.nextInt();
      // }
      // System.out.println("Enter key to search");
      // int num = sc.nextInt();
      // for(int i=0;i<a.length;i++)
      // {
      //    if(a[i]==num)
      //    {
      //       f=i;
      //       break;
      //    }

      // }
      // if(f>=0)
      // {
      //    System.out.println("key at found index"+i);
      // }
      // else
      // {
      //    System.out.println("key not found");
      // }

      // WAP to find duplicate element in an array

      // int num[]={1,2,3,2,1,4,5};
      // int i;
      // for( i=0;i<num.length;i++)
      // {
      //    for(int j=i+1;j<num.length;j++)
      //    {
      //       if(num[i]==num[j])
      //       {
      //          System.out.println(num[i]);
      //       }
      //    }
      // }

      // given array of integer nums and an integer target return indices of two number such that they add up to target
      // note : you may not use same element twice.you may assume exactly one solution exits
      // two sum problem 
      System.out.println("Enter a value of n");
      int n = sc.nextInt();
      int nums[]  = new int[n];
      int target,i;
      System.out.println("Enter target value");
      target = sc.nextInt();
      for(i=0;i<nums.length;i++)
      {
         for(int j=i+1;j<nums.length;j++)
         {
            if(nums[i]+nums[j]==target)
         }
         System.out.println(i+j);
      }




      

   } 
}