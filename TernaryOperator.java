class TernaryOperator
{
    public static void main(String args[])
    {
        System.out.println("ternary operator example");
        int a= 10;
        String result = (a==10)?"equal":"not equal"; 
        System.out.println("result"+result);
        //write a program to find maximum of two numbers 
            int x=20,y=30;
            int  z = (x<y)?x:y;
            System.out.println("z " +z); 
        //WAP to check num is positive or negative
            int m=5;
            String n = (m>0)?"positive":"negative";
            System.out.println("num is =" +n);
        // WAP to check given number is odd or even
            int p=9;
            String r=(p%2==0)?"even":"odd";
            System.out.println("number is =" +r);
        //WAP to find maximum of 3 num 
            int q=2,s=4,t=6;
            int u= (q>s&&q>t)?q:((s>t)?s:t);
            System.out.println("greater number is ="+u);
        //WAP to find minimum of 4 numbers
            int d=5,e=7,f=4,g=2;
            int h=(d<e&&d<f&&d<g)?d:((e<f&&e<g)?e:(f<g?f:g));
            System.out.println("minimum number is ="+h);
      }
}