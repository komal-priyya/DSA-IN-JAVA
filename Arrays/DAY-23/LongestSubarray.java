/*
Problem: longest subarray with given sum k




 Approach:
 Use a prefix sum and a hash map to store the first occurrence of each prefix sum. At index i, if prefixSum – k has been seen before, then there exists a subarray ending at i with sum exactly k

 
 

time complexity: O(n)
space complexity:O(1)
*/









import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static int longestSubarraywithsumk(int[] arr, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>(); // prefixSum -> first index
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // subarray from 0 to i has sum k
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // check if (prefixSum - k) exists
            if (prefixMap.containsKey(prefixSum - k)) {
                int len = i - prefixMap.get(prefixSum - k);
                maxLen = Math.max(maxLen, len);
            }

            // store first occurrence only
            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarraywithsumk(arr, k)); // Output: 6
    }
}
