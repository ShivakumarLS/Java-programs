
import java.util.Arrays;

public class Rearrange {

    static int[] reArrange(int[] nums) {
        int n = nums.length, temp[] = new int[n];
        int cnt = 0;
        for (int i : nums)
            if (i > 0)
                temp[cnt++] = i;
        int pos = cnt;
        System.out.println(pos);
        for (int i : nums)
            if (i < 0)
                temp[cnt++] = i;
        int neg = n-pos;
        System.out.println(neg);
        int[] res = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i %2==0)
            res[i] = temp[j++];
            else
            res[i] = temp[neg++];
            }
            return res;
       
    }

    public static void main(String[] args) {
        int[] nums = { -1, 1};
        System.out.println(Arrays.toString(reArrange(nums)));

    }
}
