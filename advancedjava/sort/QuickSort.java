package sort;

public class QuickSort {
    
    public static void swap(int [] arr , int i , int j)
    {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            
    }
    public static int partition(int [] arr,int low , int high)
    {
        int pivot = arr[high];
 
        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    public static void Quicksort(int [] arr, int low,int high)
    {
        if (low<high)
            {
                int j=partition(arr, low, high);
            Quicksort(arr, low, j-1);
            Quicksort(arr,j+1,high);
            }
    }
    public static void main(String[] args) {
        int [] a = {1,10,5,6,8};
        int low=0,high=a.length-1;
        Quicksort(a,low,high);
        for (int i : a)
        System.out.println(i);
    }
}
