

/* 
## Problem
Find 2nd largest element in array.

## Approach
Single pass O(n):
- Track max1, max2 (both start Integer.MIN_VALUE)
- arr[i] > max1? → max2=max1, max1=arr[i]
- else arr[i] > max2 && !=max1? → max2=arr[i]


Time complexity: O(n)

space complexity: O(1)
*/


public class secondLargestElement {

    public static int issecondLargestElement(int[] arr) {

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }

        }
        return secMax;
    }

    public static void main(String[] args) {
        int arr[] = {2, 9, 4, 6, 8};
        int result = issecondLargestElement(arr);
        System.out.println("2nd largest Element : " + result);

    }

}
