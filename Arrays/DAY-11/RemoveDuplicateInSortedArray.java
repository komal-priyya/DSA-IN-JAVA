/*
Problem: Remove Duplicates in-place from Sorted Array


---Approach:

We use the Two Pointer Technique to remove duplicates efficiently in-place.

Initialize two pointers:
->i → tracks the position of the last unique element
->j → traverses the array from the next index
Start with i = 0 and j = 1
Traverse the array using j:
->If arr[j] is different from arr[i], it means a new unique element is found:
Increment i
Copy arr[j] to arr[i]
->If elements are the same, skip (do nothing)
Continue until the end of the array
After traversal, elements from index 0 to i contain all unique elements



Time complexity: O(n)

Space complexity: O(1)

*/
import java.util.Scanner;

public class RemoveDuplicateInSortedArray {

    public static void RemoveDuplicate(int[] arr) {
        int len = arr.length;
        int j = 1;
        int i = 0;
        while (j < len) {

            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }

            j++;

        }
         System.out.print("Array after removing duplicates: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RemoveDuplicate(arr);

    }
}
