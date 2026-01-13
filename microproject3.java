import java.util.Scanner;
public class microproject3 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String s1 = new String();
    System.out.println("Enter a String : ");
    s1= sc.nextLine();
    int s = s1.length();
    if(s>5 && s<15)
    {
      char c = s1.charAt(0);
      if(Character.isLetter(c))
      {
        if(!(s1.contains(" ")))
         {
            if(!((s1.endsWith("."))|| (s1.endsWith("_"))))
            {
               for (int i = 0; i <s1.length(); i++) 
              {
                   if(Character.isLowerCase(s1.charAt(i))||Character.isDigit(s1.charAt(i))||s1.charAt(i)=='_'||s1.charAt(i)=='.' )
                   {
                    System.out.println("user name is valid : "+s1);
                   }
              }
            }
            else
            {
              System.out.println("username must not end with _ or .");
            }
         }
        else
          {
            System.out.println("plz enter username must not contain space");
          }
     }
      else
      {
        System.out.println("the username starts with alphabate");
      }
      
    }
    else
    {
      System.out.println("length of username must be between 5 to 15");
    }


  }
}
