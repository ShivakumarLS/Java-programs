
import java.util.Arrays;

public class RotateArray {

    static void rotateArray(int[] a, int k) {
        int[] nums = Arrays.copyOf(a, a.length);
        int n = a.length, j;
        for (int i = 0; i < n; i++) {
            j = (i + k) % n;
            System.out.println(i + ":" + a[i] + " " + j + ":" + nums[j]);
            a[i] = nums[j];

        }
    }

    

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArray(a, a.length-3);
        Arrays.stream(a).forEach(i -> System.out.print(i + " "));

    }
}
