import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {


public static int maxUsingForLoop(ArrayList<Integer> arr) {

        if (arr.size() == 0)
            return -1;

        if (arr.size() == 1)
            return arr.get(0);

        int max = -2147483648;
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int maxUsingBuiltIn(ArrayList<Integer> arr) {
       
        if (arr.size() == 0)
            return -1;

        if (arr.size() == 1)
            return arr.get(0);
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }

public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    int [] a = {1,2,3,4,5};
    Arrays.stream(a).forEach(i -> list.add(i));
    System.out.println(maxUsingBuiltIn(list));
    System.out.println(maxUsingForLoop(list));
}
}
