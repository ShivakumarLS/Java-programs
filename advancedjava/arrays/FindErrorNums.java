
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

    public static void main(String[] args) {

    }
}
