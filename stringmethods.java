import java.util.Arrays;
public class stringmethods 
{

  public static void main(String[] args) 
  {
    String str ="java programming";
    String str1 =new String("java programming");
    // character access and length
    // return the number of character in the string
    System.out.println("String length:"+str.length());

    // return boolean value depending upon string is empty or not
    System.out.println("is empty:"+str1.isEmpty());
    System.out.println("isBlank:"+str1.isBlank());

    // return the charcter at ith index
    System.out.println("character at 3rd position:"+str.charAt(3));

    // tocharArray()
    char[] c=str1.toCharArray();
    System.out.println(c);
    System.out.println(c.length);

    //checking equality of string
    System.out.println("checking equality:"+"Java".equals("Java"));
    System.out.println("checking equality:"+"Java".equals("java"));
    System.out.println("checking equality:"+"Java".equalsIgnoreCase("Java"));
    
    // if ASCII difference is zero then the two string are similar
    System.out.println("compareto()+"+"java".compareTo("java"));
    System.out.println("compareto()+"+"java".compareToIgnoreCase("java"));

    // converting cases
    System.out.println("changing to lower case"+"ABCDE".toLowerCase());
    System.out.println("changing to upper case"+"abcde".toUpperCase());
    
    System.out.println("checking a startwith:"+"abcde".startsWith("a"));
    System.out.println("checking a Endwith:"+"abcde".endsWith("a"));

    // concatenates string to the end of string
    String s1="java";
    String s2="programming";
    System.out.println("concatenated string = " +s1.concat(s2));
    System.out.println(s1);
    System.out.println(s2);

    // return the substring from the ith index character to end string
    System.out.println("substring:"+str.substring(3));

    // return the substring from i to j-1 index
    System.out.println("substring:"+str.substring(2,5));
    System.out.println(s1.contains("ing"));

    // return the index within the string of the first occurance of the specified string
  String s4 = "c++ java python java";
  System.out.println("indexof(String)="+"abacd".indexOf("a"));
  System.out.println("lastindexof(String)="+"abacda".lastIndexOf("a"));

  System.out.println("index of a ="+s4.indexOf("a",3));

  // replacing character
  String str2="JAVAPROGRAM";
  System.out.println("original string ="+str1);
  String str3=str2.replace('A','@');
  System.out.println("replaced A with @="+str3);
  System.out.println("javaprogram".replaceAll("java","python"));
  System.out.println("java program java".replaceFirst("java","python"));
  
  // join method
  System.out.println("join()="+String.join(",",str3,str2));
  String s[]="java program".split("a");
  System.out.println(Arrays.toString(s));
  System.out.println("split="+"java program".split(" "));

  // repeat 
  System.out.println("*".repeat(10));

  // trimming the word
  String s3=" string trimming ";
  System.out.println("trim the word "+s3.trim());
  System.out.println("trim the space"+"   ".trim()+"...");

  // value of 
  int a=10;
  String s6=String.valueOf(a);
  System.out.println(s6.length());
  System.out.println(s6+10);
  }
}
