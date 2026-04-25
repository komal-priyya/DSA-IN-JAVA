/*
Problem: longest subarray with given sum k




 Approach:
 Use a prefix sum and a hash map to store the first occurrence of each prefix sum. At index i,
  if prefixSum – k has been seen before, then there exists a subarray ending at i with sum 
  exactly k

 
 

time complexity: O(n)
space complexity:O(1)
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubarray {
    public static List<Integer> longestSubarraywithsumk(int[] arr, int k) {
        HashMap<Integer, Integer> prefixMap = new HashMap<>(); // prefixSum -> first index
        int prefixSum = 0;
        int maxLen = 0;
        int start= -1;
        int end= -1;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // subarray from 0 to i has sum k
            if (prefixSum == k) {
                if(i+1> maxLen){
                    maxLen = i + 1; 
                    start= 0;
                    end= i;
                }
               
            }

            // check if (prefixSum - k) exists
            if (prefixMap.containsKey(prefixSum - k)) {

                int prevIndex= prefixMap.get(prefixSum - k);
                int len = i- prevIndex;
                if(len >maxLen){
                    maxLen = len;
                    start = prevIndex + 1;
                    end= i;
                }
            }

            // store first occurrence only
            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }

        List<Integer> ans= new ArrayList<>();
        if( start == -1){
            return ans;
        }
        for(int i= start; i<=end; i++){
            ans.add(arr[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        int k = 6;
        List<Integer> result = longestSubarraywithsumk(arr, k);

        System.out.println(result); 
    }
}
