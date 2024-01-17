
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountNicePairs {

    public static void main(String[] args) {
        int[] arr = { 13, 10, 35, 24, 76 };
        System.out.println(countNicePairs(arr));
        System.out.println(Character.isDigit(0));
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        System.out.println(set);
        
    }

    public static int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        long result = 0;
        for (int i : nums) {
            int val = i - reverse(i);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        Collection<Integer> values = map.values();
        int mod = 1000000007;
        for (int value : values)
            result = (result % mod + ((long) value * ((long) value - 1) / 2)) % mod;
        return (int) result;

    }

    static private int reverse(int num) {
        int res=0;
        while (num != 0) {
            res *= 10;
            res += num % 10;
            num /= 10;
        }
        return res;
    }

}

