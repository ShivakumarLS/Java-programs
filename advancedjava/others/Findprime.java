public class Findprime {
    public static boolean isPrime(int n)
    {
        for (int i =2;i<=n/2;i++)
            if (n%i==0)
            return false;
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,5,7,23,66,78};
    System.out.println();
        for (int i : arr)
            if(isPrime(i))
                System.out.print(i+" ");
    
            }
}
