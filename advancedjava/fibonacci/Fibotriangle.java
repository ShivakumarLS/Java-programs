package fibonacci;

public class Fibotriangle {

    static void fib(int [] arr,int n)
    {
         arr[1]=1;arr[2]=2;
         for (int i = 3;i<n;i++)
         {
            arr[i]=arr[i-1]+arr[i-2];
         }
    }
    static void fibTriangle(int n)
    {
        int N = n*(n+1)/2;
        int [] f = new int [N+1];
        fib(f,N);
    int fibnum=1;
    for(int i=1;i<=n;i++)
    
        for(int j=1;j<=i;j++)
        System.out.print(f[fibnum++]+" ");
        System.out.println();
        
    
    }
    public static void main(String[] args) {

        fibTriangle(5);
    }
}
