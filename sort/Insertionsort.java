package sort;
public class Insertionsort {
    
    static void insertionSort(int [] arr)
    {
        for (int i =1 ;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && temp<=arr[j])
            {
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,8,6,9,6};
        insertionSort(arr);
        for(int i : arr)
        System.out.println(i);

    }
}
