
/*
Problem: the Kth Element in an Array


Approach:

-Maintain min heap of size K
-Add every element
-If size exceeds K → remove smallest
-At end → top = Kth largest

Time complexity: O(n log k)
Space complexity:   O(k)
 */
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {

    public static int kthLargestElement(int[] nums, int k) {
        // Min heap of size k
        // smallest element in heap = kth largest overall
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll();  // remove smallest  keep top k
            }

        }
        return minHeap.peek();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = kthLargestElement(nums, k);
        System.out.println("kth largest element :" + result);
    }
}
