package JavaPrograms.arrays;

import java.util.Arrays;

public class LeftRotate {
    static void rotateRight(int[] a, int k) {
        int n = a.length;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        int cnt = 0;
        for (int i = n - k; i < n; i++) 
          temp[cnt++] = a[i];
        for (int i = n - k - 1; i >= 0; i--) 
            a[i + k] = a[i];
        for (int i = 0; i < k; i++)
            a[i] = temp[i];
    }

    public static void main(String[] args) {
        int [] a = new int[] { 1, 2, 3, 4, 5 };
        rotateRight(a, 2);
        Arrays.stream(a).forEach(i -> System.out.println(i + " "));
    }

}
