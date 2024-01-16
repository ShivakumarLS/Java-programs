package fibonacci;

import java.util.Scanner;

// For each test case, print Fibn % (108+7).
public class Fibnmod {

    public static int fib(int n )
    {
        if (n==1 || n==0)
        return n;
        else 
         return fib(n-1)+fib(n-2) ;
    }

    static void FastDoubling(int n, int []res)
{
    int a, b, c, d;
    int MOD = 1000000007;
     
    // Base Condition
    if (n == 0) 
    {
        res[0] = 0;
        res[1] = 1;
        return;
    }
    FastDoubling((n / 2), res);
 
    // Here a = F(n)
    a = res[0];
 
    // Here b = F(n+1)
    b = res[1];
 
    c = 2 * b - a;
 
    if (c < 0)
        c += MOD;
 
    // As F(2n) = F(n)[2F(n+1) – F(n)]
    // Here c = F(2n)
    c = (a * c) % MOD;
 
    // As F(2n + 1) = F(n)^2 + F(n+1)^2
    // Here d = F(2n + 1)
    d = (a * a + b * b) % MOD;
 
    // Check if N is odd
    // or even
    if (n % 2 == 0)
    {
        res[0] = c;
        res[1] = d;
    }
    else
    {
        res[0] = d;
        res[1] = c + d;
    }
}
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double power = Math.pow(10, 8);
    power+=7;
    int [] res = new int[2];
    FastDoubling(n, res);
    int fibn=res[0];
    System.out.println(fibn);;
    System.out.println((int)fibn%power);
    sc.close();
}
    
}
