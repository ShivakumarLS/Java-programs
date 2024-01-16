package fibonacci;


// a number is a fibonaccin number if only 5n^2+ 4 or -4 or both is a perfect square 
public class IsFibonacci {

    public static boolean isSquare(int n)
    {
        return Math.pow((int)Math.sqrt(n), 2)==n;
            
    }

    public static boolean isFib(int n)
    {
        return isSquare(5*n*n+4)||isSquare(5*n*n-4); 
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isFib(n));
    }
    
}
