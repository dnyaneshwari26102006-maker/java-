import java.util.Scanner;
public class contexmp 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int a=0;
        // if(a==0)
        //     {
        //         System.out.println("num is zero");
        //     }
        //     else if(a>0)
        //     {
        //         System.out.println("num is positive");
        //     }
        //     else
        //     {
        //         System.out.println("num is negative");
        //     }


        //WAP to find maximum of 3 number
        // System.out.println("Enter a n1");
        // int n1 = sc.nextInt();
        // System.out.println("Enter a n2");
        // int n2 = sc.nextInt();
        // System.out.println("Enter a n3");
        // int n3 = sc.nextInt();
        // if(n1>n2&&n1>n3 )
        // {
        //     System.out.println("n1 is greater");
        // }
        // else if(n2>n3)
        // {
        //     System.out.println("n2 is greater");
        // }
        // else
        // {
        //     System.out.println("n3 is greater");
        // }


        //WAP to check enter num is multiple of 3 and 5 if else then print divisible by both or only 5 or only 3
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // if(num%3==0)
        // {
        //     System.out.println("num is divisible by 3");
        // }
        // else if(num%5==0)
        // {
        //     System.out.println("num is divisible by 5");
        // }
        // else if(num%3==0 && num%5==0)
        // {
        //     System.out.println("num is divisible by both");
        // }
        // else
        // {
        //     System.out.println("not divisible by 3 and 5");
        // }


        //WAp to print grade accroding to marks
        // System.out.println("Enter a marks");
        // int mark = sc.nextInt();
        // if(mark>=90 && mark<=100)
        // {
        //     System.out.println("grade A+");
        // }
        // else if(mark>=80 && mark<=89)
        // {
        //     System.out.println("grade A");
        // }
        // else if(mark>=70 && mark<=79)
        //     {
        //         System.out.println("grade B");
        //     } 
        //     else if(mark>=60 && mark<=69)
        //         {
        //             System.out.println("grade C");
        //         } 
        //         else if(mark>=50 && mark<=59)
        //             {
        //                 System.out.println("grade D");
        //             } 
        //             else if(mark>=35 && mark<=50)
        //                 {
        //                     System.out.println("grade E");
        //                 }
        //                 else if(mark<=35)
        //                     {
        //                         System.out.println("Fail");
        //                     } 


            //WAP to accept character value from user and check whether its alphabate special symbol or number
                            // System.out.println("Enter a Chracter");
                            // char c = sc.next().charAt(0);
                            // if((c>='A' && c<='Z')||(c>='a' && c<='z'))
                            // {
                            //     System.out.println("character is alphabate");
                            // }
                            // else if(c>='0' && c<='9')
                            // {
                            //     System.out.println("chracter is digit");
                            // }
                            // else
                            // {
                            //     System.out.println("chracter is symbol");
                            // }

                            
                        //WAP to check enter number is one digit or two digit or three digit
                            System.out.println("Enter a numbetr ");
                            int number = sc.nextInt();
                            if(number>=0 && number<=9)
                            {
                                System.out.println("number is one digit");
                            }
                            else if(number>=10 && number<=99)
                            {
                                System.out.println("number is two digit");
                            }
                            else if(number>=100 && number<=999)
                            {
                                System.out.println("number is three digit");
                            }
                            else if(number>=1000 && number<=9999)
                            {
                                System.out.println("number is four digit");
                            }
        }
    }
