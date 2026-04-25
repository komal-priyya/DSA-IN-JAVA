/*

Problem:Length of longest Subarray with sum k




Approach:Use Prefix Sum + HashMap to find the length of the longest subarray with sum k

-> Maintain a running sum prefixSum
->If prefixSum == k , then sunarray from index 0 to i has sum k
->If(prefixSum -k) exists in the map, then a subarray with sum k exists between the previous index+1 and current index
-> store the first occurence of each prefix sum in the map to maximize subarray length







time complexity:O(n)



space complexity:O(n)
HashMap may store up to n prefix sums




*/ 


import java.util.HashMap;

public class LengthOfLongestSubarray {
    
    public static int LengthOfLongestSubarray(int []arr, int k){

          HashMap<Integer, Integer> prefixMap = new HashMap<>(); // prefixSum -> first index
        int prefixSum = 0;
        int maxLen = 0;


          for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == k) {
                if(i+1> maxLen){
                    maxLen = i + 1; 
                   
                }
                if(prefixMap.containsKey(prefixSum-k)){
                    int len =i - prefixMap.get(prefixSum-k);
                    maxLen = Math.max(maxLen,len);

                }
                if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
          }}
          return maxLen;







    }
    public static void main(String[] args) {
        int []arr= {1,2,3,1,1,1,1};
        int k=6;
        System.out.println(LengthOfLongestSubarray(arr, k));
    }
}
