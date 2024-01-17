
import java.util.ArrayList;

public class Leaders {
    static void findLeaders(int[] nums) {

        int n = nums.length,max = nums[n - 1];
       ArrayList<Integer> list = new ArrayList<>();
       list.add(nums[n-1]);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                list.add(nums[i]);
            }
        }
        for (int i =list.size()-1 ;i >= 0; i--) {
        System.out.printf("%d ",list.get(i));
        }
    }
    public static void main(String[] args) {
        int [] n = {10, 22, 12, 3, 0, 6};
        findLeaders(n);
    }
}
