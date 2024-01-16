package search;

import java.util.Arrays;
import java.util.HashMap;

public class BinarySearch {

    public static boolean binarySearch(int [] arr,int searchfor)
    {
        Arrays.sort(arr);
        int low =0,high=arr.length-1;
        boolean flag = false;
        while (low<=high)
        {
            int mid = low + (high-low)/2;
            if (arr[mid]== searchfor)
                flag=true;
            if (arr[mid]<searchfor)
                low=mid+1;
            else 
                high=mid-1;
        }
         return flag;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 5, 2, 9, 10, 11, 12, 2, 4 };
        System.out.println(Arrays.toString(arr));
        int searchfor = 51;
        System.out.println(Arrays.binarySearch(arr,searchfor)>=0);

         HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0, 1);
        System.out.println(map.keySet().contains(0));
    //    if(binarySearch(arr, searchfor) == true)
    //     System.out.println("search successful");
    //    else 
    //     System.out.println("search  unsuccessful");


    }

}
