import java.util.ArrayList;
import java.util.Arrays;

public class ThirdLowest {

    public static int remdup(int[] arr) 
    {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) 
           if(!alist.contains(arr[i]))
                alist.add(arr[i]);
        
        return alist;
    }

    public static void main(String[] args) 
    {
        int[] arr = { 1, 3,4,4,6,7,8,8, 3, 8, 5,  9, 10, 11, 12,  4 };
        ArrayList<Integer> alist = remdup(arr);
        System.out.println(alist.get(2) + " is the 3rd lowest integer");

    }

}