/*
Problem: Find the Kth smallest element in an unsorted array without sorting the entire array.

Approach — Max Heap of Size K

Keep only the K smallest elements seen so far using a Max Heap.
The largest element in that heap = Kth smallest overall.

->Why Max Heap?


Max Heap keeps the largest element on top
When a smaller element arrives, kick out the largest (top)
After processing all elements, top = Kth smallest



Complexity
Time complexity :O(n log k)
Spacecomplexity: O(k)
*/ 
import java.util.Collections;
import java.util.PriorityQueue;



public class KthSmallest {
   public static int kthsmallest(int[]nums, int k){

  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    for(int num:nums){
        maxHeap.add(num);
        if(maxHeap.size()>k){
            maxHeap.poll();
        }

    }
    return maxHeap.peek();

   }
   public static void main(String[]args){


    int nums[]= {7,10,4,3,20,15};
    int k=3;

    int result= kthsmallest(nums,k);
    System.out.println("kth smallest : " + result);
   } 
}
