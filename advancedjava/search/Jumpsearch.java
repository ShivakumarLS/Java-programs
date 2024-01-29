package search;

import java.util.Arrays;

public abstract class Jumpsearch {

    public static int jumpSearch(int[] a, int target) {
        Arrays.sort(a);
        int n = a.length;
        int step = (int) Math.sqrt(n);
        int low = 0, high = step;
        while (a[high] <= target && high < n) {
            low = high;
            high += step;
            if (high > n - 1)
                high = n;
        }
        for (int i = low; i < high; i++)
            if (a[i] == target)
                return i;

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int searchfor = 3;
        int res = jumpSearch(arr, searchfor);
        if (res == -1)
            System.out.println("not present");
        else
            System.out.printf("%d is present at %d", searchfor, res);
    }
}
