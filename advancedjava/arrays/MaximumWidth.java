package JavaPrograms.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumWidth {

    static public int  maximumWidth(int [] [] points)
    {
    
        if (points == null || points.length == 0) return 0;
        List<Integer> list = new ArrayList<>();
        for(int [] i : points)
            list.add(i[0]);
        Collections.sort(list);
        int maxi=0;
        for(int i =1 ;i<list.size();i++ )
            maxi=Math.max(list.get(i)-list.get(i-1),maxi);
        return maxi;

    }



public static void main(String[] args) {
    int arr[][] = {{9,7},{7,4}, {9,9}, {8,7}};
    System.out.println("Maximum Width of the Array is " + maximumWidth(arr));

}
}
