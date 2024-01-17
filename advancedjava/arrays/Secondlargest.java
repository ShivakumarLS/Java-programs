
import java.util.Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int max = -1, max2 = -1;
        Arrays.sort(a);
        for (int i : a) {
            if (i > max) {
                max2 = max;
                max = i;
            }
        }
        System.out.println(max2);
    }

}
