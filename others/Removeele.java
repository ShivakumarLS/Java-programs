import java.util.Arrays;

public class Removeele {
    public static int removeElement(int[] nums, int val) {
        int cnt=0;
        int [] temp = new int[nums.length];

        for (int i =0;i<nums.length;i++ )
            if (nums[i]!=val) 
                temp[cnt++]=nums[i];
            
    
       for(int i = 0;i<nums.length;i++)
            nums[i]=temp[i];

        return cnt;
    }
    public static void main(String[] args) {
        
        int [] a = {1,3,2,4};
        int val=3;
        removeElement(a,val);
        System.out.println(a);
       
        Arrays.stream(a).forEach(System.out::println);
        
    }
    
}
