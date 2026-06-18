/*
Problem: Left Rotate Array by one

Approach:

->To perform a left rotation by one position:

Store the first element of the array in a temporary variable (temp)
Shift all elements one position to the left:
For each index i, assign arr[i] = arr[i + 1]
After shifting, place the stored first element at the last index:
arr[n - 1] = temp

This moves every element one step left and brings the first element to the end.


Time complexity: O(n)

Space complexity: O(1)


*/ 
import java.util.Scanner;

public class LeftRotateArrayByOne {

    public static void LeftRotate(int[] arr) {

        int n = arr.length;
        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = inp.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");

        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        LeftRotate(arr);

        System.out.println("Array after left rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}