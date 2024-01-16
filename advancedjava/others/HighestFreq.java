import java.util.HashMap;
import java.util.Map;
public class HighestFreq {
    
   
    public static int  count(int [] a , int b)
    {
        int cnt =0;
        for(int i : a)
        {
            if (i==b)
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        
        int [] a = {1,2,4,4,5,6,6,6,5,5,6};
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
        int max = -1,maxele=0;
        for(int i : a)
        {
            hm.put(i, count(a, i));
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
            
        for(int i = 0;i<a.length;i++)
            {
                if((hm.get(a[i]))>max)
                    {
                        max= hm.get(a[i]);
                        maxele=a[i];
                    }
            }
            System.out.println(maxele);
    }
    
}
