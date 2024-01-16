package JavaPrograms.arrays;

import java.util.HashMap;

public class TwentyFiveperc {

    static public  int  findSpecialInteger(int [] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr )
            map.put(i,map.getOrDefault(i,0)+1);
        for(int e : map.keySet())
            if(map.get(e)> 0.25*arr.length)
                return e;
    return -1;
            }

    public static void main(String[] args) {
        int[] a = { 2, 2, 2, 4,4, 5 };
        System.out.println(findSpecialInteger(a));
    }
}
