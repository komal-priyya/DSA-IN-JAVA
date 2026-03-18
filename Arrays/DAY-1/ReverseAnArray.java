/*
Problem: ReverseAnArray


Approach:I solved this problem using an in-place reversaltechnique based on symmetric index swapping
-    n is length of the array.
-  Iterate from index i=0 to i<n/2.
- for each index i, swap the element at position i with the element at position n-i-1

=> With this every swap placed two elements in their correct reversed positions
=>After processig n/2 elements, the entire array is reversed


Time complexity: O(n)
space Complexity:O(1`)
*/





public class ReverseAnArray {
    public static void reverseArray(int[]arr){
int n= arr.length;
         for (int i = 0; i<n/2; i++) {
          int temp=arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;

           
         }     

  
    }
  
    public static void main(String[] args) {
        int []arr={3,6,4,9};
          reverseArray(arr);
        for(int num: arr){
            System.out.println(num + "");
        }
    }
}
