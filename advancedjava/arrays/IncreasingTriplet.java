package JavaPrograms.arrays;

public class IncreasingTriplet {

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3)
            return false;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= first) {
                first = nums[i];
            } else if (nums[i] <= second) {
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean decreasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3)
            return false;
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= first)
                first = nums[i];
            else if (nums[i] >= second)
                second = nums[i];
            else
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] temp = { 1, 6, 2, 5, 1 };
        System.out.println(decreasingTriplet(temp));
    }
}
