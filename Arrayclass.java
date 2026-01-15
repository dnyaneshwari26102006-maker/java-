import java.util.Arrays;
import java.util.List;
public class Arrayclass 
{
  public static void main(String[] args) 
  {
    int[] a={10,2,3,4,5,60};
    System.out.println("toString() for 1D array: "+Arrays.toString(a));

    int[][] b={
      {10,20},
      {20,30}};
      
      System.out.println("toString() 2d array: "+Arrays.toString(b));
      System.out.println("deepToString() 2d array: "+Arrays.deepToString(b));
      System.out.println("copyof(arrayname,length) for 1d array:"+Arrays.toString(Arrays.copyOf(a,2)));

      String arr[]={"abc","pqr","xyz","mnq","def"};
      System.out.println("copyofrange(arrayname,from(index),to) for 1d array:"+Arrays.toString(Arrays.copyOfRange(arr,2,6)));
      System.out.println("copyofrange(arrayname,from(index),to) for 1d array:"+Arrays.toString(Arrays.copyOfRange(a,2,8)));
      System.out.println("copyofrange(arrayname,from(index),to) for 1d array:"+Arrays.toString(Arrays.copyOfRange(arr,2,8)));

      int c[]=new int[8];
      System.out.println("Array without initilization"+Arrays.toString(c));
      Arrays.fill(c,10);
      System.out.println("fill(array,value):"+Arrays.toString(c));
      Arrays.fill(c,3,6,1);
      System.out.println("Fill(array,value):"+Arrays.toString(c));

      int[] x={1,2,3,4,6,7};
      int[] y={1,2,34,4,6,7};
      System.out.println("equals(arr1,arr2) :"+Arrays.equals(x,y));//check value
      System.out.println("equals(arr1,arr2) :"+(x==y));//check address

      System.out.println("compare(arr1,arr2) :"+Arrays.compare(x,y));//if both array equal then it return 0 if a1>a2 then return 1  and a1<a2 then return -1.

      Arrays.sort(x);
      System.out.println("array after sorting"+Arrays.toString(x));

    Arrays.sort(arr);
    System.out.println("string array after sorting "+Arrays.toString(arr));
    
    Arrays.sort(y,2,4);
    System.out.println("array after sorting "+Arrays.toString(y));

    int[][] arr1={
      {1,2},
      {3,4}
    };

    System.out.println("Equals(arr1,arr2):" +Arrays.equals(arr1,b));//for 1d array
    System.out.println("equals(arr1,arr2): "+Arrays.deepEquals(arr1,b));//for 2d array 
 
    int[] x1={100,200,3,40,6,7};
    System.out.println("Binarysearch(array,key):"+Arrays.binarySearch(x1,3));
    System.out.println("Binarysearch(array,key):"+Arrays.binarySearch(x1,5));
    System.out.println("Binarysearch(array,key):"+Arrays.binarySearch(x1,3,6,5));
    
    System.out.println("mismatch(array1,array2):"+Arrays.mismatch(x,y));
    System.out.println("mismatch(array1,array2):"+Arrays.mismatch(x,2,3,y,2,3));
    
    System.out.println("list(array,value):"+Arrays.asList(c));

    List<String> i=Arrays.asList(arr);
    System.out.println("List of array :"+i);
  }
}
