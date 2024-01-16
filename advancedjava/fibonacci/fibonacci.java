package fibonacci;

import java.util.Scanner;

public class fibonacci {
//  public static int fib(int n)
//  {
//     if (n==0 || n==1 )
//     return n;

//     return fib(n-1)+fib(n-2);
//  }   
    
 public static void main(String [] args)
 {
   
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [] fibn= new int [n];
    fibn[0]=0;fibn[1]=1;
    for(int i=2;i<n ;i++)
    {
        fibn[i]=fibn[i-1]+fibn[i-2];
    }
    for (int i:fibn){
        System.out.print(i+" ");
    }
sc.close(); 
}
}
