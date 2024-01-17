

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDup {
    public static int []  removeDuplicates(int[] a) {
        int cnt = 0;
        Set<Integer> set = new TreeSet<>();
        for (int i : a)
            set.add(i);

        for (int i : set) {
            a[cnt] = i;
            cnt++;
        }
        for(int i = set.size();i<a.length;i++)
            a[i]=-1;    

        return a;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 5 };
        Arrays.stream(removeDuplicates(arr)).forEach(i -> System.out.print(i+" "));
    }
}
