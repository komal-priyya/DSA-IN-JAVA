




/* 
## Problem
Check if an  Array is sorted

## Approach
To check whether the given array is sorted in non-decreasing (increasing) order, we use a simple linear traversal.

Start iterating from the second element of the array.
For each element, compare it with its previous element.
If at any point the current element is less than the previous element, the array is not sorted.
In such a case, return false immediately (early termination).
If the loop completes without finding any violation, the array is sorted, so return true.


Time complexity: O(n)

space complexity: O(1)
*/


import java.util.Arrays;
import java.util.Scanner;
public class checkIfArrayIsSorted{
public static boolean IsSorted(int[] arr) {

for (int idx = 1; idx < arr.length; idx++) {
  if(arr[idx]<arr[idx-1]){
return false;
  }
  

    
}
return true;


}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: take size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];

       
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

       System.out.println(Arrays.toString(arr));
boolean result=IsSorted(arr);
 if (result) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
        sc.close();


    }
}
