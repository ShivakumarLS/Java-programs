
import java.util.Arrays;

public class MaxTime {
    static public String findMaxTime(int[] nums) {
        Arrays.sort(nums);
        String checker = "";
        for (int i : nums)
            checker += i;
        if (Integer.parseInt(checker) > 2400)
            return "no valid time possible";
        int[] result = { -1, -1, -1, -1 };

        int[] count = new int[10];
        for (int num : nums)
            count[num] += 1;

        result[0] = findDigit(count, 2);
        result[1] = (result[0] == 2) ? findDigit(count, 3) : 9;
        result[2] = findDigit(count, 5);
        result[3] = findDigit(count, 9);
        return result[0] + "" + result[1] + ":" + result[2] + "" + result[3];
    }

    static String helper(int[] nums) {
        int[] result = { -1, -1, -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result[0] && nums[i] <= 2) {
                result[0] = nums[i];
                nums[i] = -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result[1]) {
                {result[1] = nums[i];
                    nums[i]=-1;
                }
        }
         }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result[2]) {
                {result[2] = nums[i];
                    nums[i]=-1;
                }
        }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result[3]) {
                {result[3] = nums[i];
                    nums[i]=-1;
                }
        }
        }
       
        return new String(String.format("%d%d:%d%d", result[0],result[1],result[2],result[3]));
        
       
    }

    static public int findDigit(int[] count, int limit) {
        for (int i = limit; i > -1; i--) {
            if (count[i] > 0) {
                count[i]--;
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(helper(new int[] { 1, 5, 6, 2 }));

    }
}