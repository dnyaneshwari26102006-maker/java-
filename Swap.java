class Swap
{
    public static void main(String args[])
    {//swapping of two numbers using third variable
        int a=10,b=20,c;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
        //swapping of two nubers without using third variable
        System.out.println("value of a and b before swapping "+a +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a and b after swapping");
        System.out.println("a"+a);
        System.out.println("b"+b);

    }
}