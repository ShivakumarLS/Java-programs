package JavaPrograms.arrays;

import java.util.ArrayList;
import java.util.List;

public class KlengthApart {

      public static boolean kLengthApart(int[] a, int k) {
       int n = a.length;
       List<Integer> list = new ArrayList<>();
       for(int i =0;i<n;i++)
         if(a[i]==1)
             list.add(i);
        
       for(int i=1;i<list.size();i++)
            if(list.get(i)-list.get(i-1) <=k)
                return  false;
        return true;
  
    }
public static void main(String[] args) {
    int [] a = {1,0,0,1,0,1};
    System.out.println(kLengthApart(a,2));
}
}
