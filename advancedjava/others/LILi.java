import java.util.ArrayList;

import java.util.List;

public class LILi {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list.addAll(list2);
        System.out.println(list);
    }
}
