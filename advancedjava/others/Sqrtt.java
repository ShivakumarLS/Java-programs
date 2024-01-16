public class Sqrtt {

    private static int mySqrt(int x)
    {
       double low =0,high=x-1; 
        double mid = low+ (high-low)/2;
        while ((mid*mid - x)>0.1 )   // set the accuracy level here
        {
            if((mid * mid - x) < 0)
            high = mid;
            else
            low = mid;
            mid = low + (high - low)/2;
            }

       return (int)Math.ceil(mid);
    }
public static void main(String[] args) {
    double val  = 2.7418;
    // System.out.println(mySqrt(10));
    System.out.println(Math.floor(val));
    System.out.println(mySqrt((int)val));
}
}
