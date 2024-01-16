package Javabasics;

class newclass extends Polymorphism
{
    public  int sum(int a)
    {
        return super.sum(a, a);
    }

    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    
}

public class Polymorphism {

    public static int sum(int a,int b)
    {
        return a+b;
    }

    public static double sum(double a ,double b)
    {
        return a+b;
    }

public static void main(String[] args) {
        int a=3,b=4;
        double c=3.0,d=4.0;
        System.out.println(sum(a,b));
        System.out.println(sum(c,d));
        System.out.println(Polymorphism.sum(a,b));
        System.out.println(newclass.sum(a,b,(int)(c+d)));
    }
    
}
