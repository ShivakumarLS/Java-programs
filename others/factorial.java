import java.util.Scanner;

public class factorial {
    public static int fact(int n)
    {
        if (n==0 || n==1)
        return 1;
        return n*fact(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("factorial of %d is %d ",n,fact(n));
        sc.close();
    }
}
