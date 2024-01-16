package fibonacci;
import java.util.Scanner;

public class Nthfibonacci {
    public static int fib(int n )
    {
        if (n==1 || n==0)
        return n;
        else 
         return fib(n-1)+fib(n-2) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("%d is %d th fibonacci number",fib(n-1),n);
        sc.close();
    }
    
}
