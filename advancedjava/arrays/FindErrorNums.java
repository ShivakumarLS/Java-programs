
import java.util.Arrays;

public class FindErrorNums {
    static public int[] findErrorNums(int[] nums) {
        int repeating = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            repeating = (nums[i] == nums[i - 1]) ? nums[i] : 0;
            nums[i] = 0;
        }
        int actualSum = Arrays.stream(nums).sum();
        int naturalSum = (nums.length * (nums.length + 1) / 2);
        return new int[] { repeating, naturalSum - actualSum };
    }

    static public int[] findErrorNumsTwo(int[] nums) {
        int repeating = 0,missing = 0;
        int []  perfectArray  = new int [nums.length+1];

        for(int i : nums)
            perfectArray[i]++;

        for (int i = 0; i <perfectArray.length; i++) {
            if(perfectArray[i]==2)
                repeating = i;
            if(perfectArray[i]==0)
                missing=i;
            
        }
        
        return new int[] { repeating,missing };
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,7,7};
    System.out.printf("[%d,%d]",findErrorNumsTwo((nums))[0],findErrorNumsTwo(nums)[1]);
    }
}
