package Strings;

import java.util.Arrays;

public class HighestHour {

    static public String hourFinder(int[] nums) {
        int max1=-1,max2=-1;
        Arrays.sort(nums);
        if(nums[0]>=3 )
            return "" ;
        for(int i =1;i<nums.length;i++)
            {
                
            }
        return max1+""+max2;
        }
    // Driver code
    public static void main(String[] args) {
        int arr[] = { 2,1,2,1};
       
        System.out.println(hourFinder(arr));
    }
}
