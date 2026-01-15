import java.util.Arrays;
import java.util.Scanner;
// WAP sort an array in decending order
public  class ArrayFunction
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int[] x={1,3,4,6,7,2,9,8};
    Arrays.sort(x);
    for(int i=x.length-1;i>=0;i--){
      System.out.print(x[i]);
    }

// WAP to create an array in which value from index 2 to 5 is 9 and remaining is 0.
    int[] y=new int[10];
    Arrays.fill(y,2,5,9);
    System.out.println("fill array:"+Arrays.toString(y));

    // WAP to create a new array from given array of from index 1 to 4.

    int a[]={1,2,3,4,5,6,7};
    System.out.println("to copy new array:"+Arrays.toString(Arrays.copyOfRange(a,1,4)));

    // WAP to find 2nd largest number from an array.
    // int arr[]=new int[5];
    // System.out.println("enter array element");
    // for(int i=0;i<arr.length;i++)
    // {
    //   arr[i]=sc.nextInt();
    // }
    //   Arrays.sort(arr);
    //  System.out.println("2nd largest num"+(arr[arr.length-2]));

    // WAP to find min and max element from array.
    // int array[]=new int[5];
    // System.out.println("enter array element");
    // for(int i=0;i<array.length;i++)
    // {
    //   array[i]=sc.nextInt();
    // }
    //   Arrays.sort(arr);
    //  System.out.println(" largest num"+(arr[array.length-1]));
    //  System.out.println("minimum number: "+arr[0]);

    //  WAP to find given key is present in an array is not if it is present then return it index.

    int arr1[]={10,20,30,40,50};
     System.out.println("key present at index:"+Arrays.binarySearch(arr1,30));
    



}

} 
