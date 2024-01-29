package sort;

public class QuickSort {
    
    // public static void swap(int [] arr , int i , int j)
    // {
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j]=temp;
            
    // }
    // public static int partition(int [] arr,int low , int high)
    // {
    //     int pivot = arr[high];
    //     int i = (low - 1);
    //     for (int j = low; j <= high - 1; j++) {
    //         if (arr[j] < pivot) { 
    //             i++;
    //             swap(arr, i, j);
    //         }
    //     }
    //     swap(arr, i + 1, high);
    //     return (i + 1);
    // }
    // public static void Quicksort(int [] arr, int low,int high)
    // {
    //     if (low<high)
    //         {
    //             int j=partition(arr, low, high);
    //         Quicksort(arr, low, j-1);
    //         Quicksort(arr,j+1,high);
    //         }
    // }
    static void swap(int [] nums , int i , int j )
    {
        int  temp = nums[i] ;
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static int partition (int [] nums , int low , int high)
    {
        int pivot = nums[high];
        int i = (low-1);
        for(int j = low ; j<=high-1;j++)
        {
            if(nums[j]<pivot)
                swap(nums,++i,j);
        }   
        swap(nums , (i+1),high);
        return (i+1);
    }

    static void quickSort(int [] nums,int low , int high )
    {
        if(low<high)
        {
            int mid = partition(nums, low, high);
            quickSort(nums, low, mid-1);
            quickSort(nums, mid+1, high);
        }
    }
    public static void main(String[] args) {
        int [] a = {1,10,5,6,8};
        int low=0,high=a.length-1;
        quickSort(a,low,high);
        for (int i : a)
        System.out.println(i);
    }
}
