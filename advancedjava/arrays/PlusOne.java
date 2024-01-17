
import java.util.Arrays;


public class PlusOne {

    static public int[] plusOne(int[] nums) {
        int n = nums.length;
        if (n==0)
        return nums;
        if(n==1 && nums[n-1]==9)
            {
                int temp[] = new int[2];
                temp[0]=1;
                temp[1]=0;
                return temp;
            }
        if(n==1 && nums[n-1]!=9)
            {
                nums[0]+=1;
                return nums;
            }
        if(n>=2 && nums[n-1]!=9)
        {
            nums[n-1]+=1;
            return nums;
        }
        else{
            n+=1;
           
            int[] temp = new int[n];
           
            int m = n;
            for(; nums[m-1]==9;  m--)
            {
                temp[m-1]=0;
            }
           temp[m-2]=1;
            return temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
      
    }

}
