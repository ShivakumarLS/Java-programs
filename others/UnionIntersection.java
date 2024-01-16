import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UnionIntersection {

    static ArrayList<Integer> union(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : a)
            set.add(i);
        for (int j : b)
            set.add(j);
        for (int i : set)
            list.add(i);
        return list;
    }

    static ArrayList<Integer> intersection(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i : a)
            set.add(i);
        for (int i : b) {
            if (set.contains(i))
                res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 }, b = { 4, 5, 6 };

        System.out.println("union");
        System.out.print("{");
        for (int i : union(a, b))
            System.out.print(i + " ");
        System.out.println("}");
        System.out.println("intersection");
        System.out.print("{");
        for (int i : intersection(a, b))
            System.out.print(i + " ");
        System.out.print("}");
    }
}
