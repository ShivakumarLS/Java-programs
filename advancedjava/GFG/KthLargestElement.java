package GFG;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Build a min heap with the first k elements
        for (int i = 0; i < k; ++i) {
            minHeap.offer(nums[i]);
        }

        
        for (int i = k; i < nums.length; ++i) {
            if (nums[i] > minHeap.peek()) {
                System.out.println(minHeap.peek());
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        // The top of the heap now contains the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 4, 2, 2, 5, 3, 6};
        int k = 3;

        int kthLargest = findKthLargest(nums, k);

        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
}
