
import java.util.Arrays;

public class MOveZeroes {
    static void movezeroes(int [] a)
    {
        int temp []= new int[a.length],cnt=0 ;
      
        for(int i:a)
        if(i!=0)
            temp[cnt++]=i;
        for(int i=0;i<temp.length;i++)
            a[i]=temp[i];
        
    }
    public static void main(String[] args) {
     
        int [] a = new int[] { 1,0,6,0,2, 3, 4, 5,0,0,0 };
        movezeroes(a);
        Arrays.stream(a).forEach(i -> System.out.print(i + " "));
    }

}
