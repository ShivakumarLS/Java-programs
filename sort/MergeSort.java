package sort;

import java.util.Arrays;

public class MergeSort {

    static void Merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1, n2 = high - mid;

        int left[] = new int[n1], right[] = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[low + i];

        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {

            if (left[i] <= right[j])
                arr[k] = left[i++];

            else
                arr[k] = right[j++];

            k++;
        }

        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];

    }

    static void Sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            Sort(arr, low, mid);
            Sort(arr, mid + 1, high);
            Merge(arr, low, mid, high);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 12,43,56,78,12,90 };
         System.out.println(Arrays.hashCode(arr));
        System.out.println("Given array is");
        printArray(arr);

        Sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
}
