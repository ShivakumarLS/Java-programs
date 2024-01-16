package JavaPrograms.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {

    static int longestSubArray(int[] a, int k) {
       
        int max = -1, n = a.length, left = 0, right = 0, sum = a[0];
        while (right < n) {
            if (sum > k && left <= right) {
                sum -= a[left++];
            }
            if (sum == k)
                max = Math.max(max, right - left + 1);

            right++;
            if (right < n)
                sum += a[right];
        }
        return max;
    }

    public static int getLongestSubarray(int[] a, int k) {
        int n = a.length;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {

            sum += a[i];
            System.out.println(sum);
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;
            System.out.println(rem);

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
            System.out.println(preSumMap);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { 1, -2, 3, -4, 5, 1,8 };
        System.out.println(getLongestSubarray(a, 9));
        System.out.println(Math.floor(5/2));
    }
}
