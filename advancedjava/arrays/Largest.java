package JavaPrograms.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


public class Largest {
    static public int binarySearch(int [] nums,int low, int high,int target)
    {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
       if(nums[mid]==target)
        return mid;
    else if(target > nums[mid])
        return binarySearch(nums,mid+1,high,target);
    return binarySearch(nums,low ,mid-1 ,target);
    }
    public static int search(int []nums, int target) {
      return binarySearch(nums,0,nums.length-1,target);
    }

    static public int findKLargest(int [] arr , int k)
    {
        if(k>arr.length)
            return -1;
        List<Integer> list = new ArrayList<>();
        for(int i : arr)
            if(!list.contains(i))
                list.add(i);
        Collections.sort(list);
        return list.get(list.size()-k);
    }
    static public int findKLargestPQ(int [] nums , int k)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
        for(int i=0 ;i < k; i++)
            minHeap.offer(nums[i]);
        for(int i =k ; i<nums.length;++i)
            {if(nums[i]>minHeap.peek())
                {
                    minHeap.poll();
                    minHeap.offer(nums[i]);
                }}
        return minHeap.peek();
           
        }
        
    
    public static void main(String[] args) {
        int [] a = {1,2,3,4,4,5,6,6,7,7,8,8,5};
        System.out.println(findKLargestPQ(a, 2));
        
        
    }
    
}
