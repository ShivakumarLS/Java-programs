
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int stat = 0; stat < n; stat++) {

            int left = stat + 1, right = n - 1;
            while (left < right) {
                int sum = nums[stat] + nums[left] + nums[right];
                if (sum > target)
                    right--;
                else if (sum < target)
                    left++;
                else {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[stat], nums[left], nums[right])));
                    left++;
                    right--;
                }

            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 2, -1, -4, 4 };
        System.out.println(Arrays.binarySearch(nums,2));
        System.out.println(threeSum(nums, 0));
        System.out.println(threeSum(nums, 2));
        System.out.println(threeSum(nums, 6));
    }
}
