/*
Problem: Rotate Array  elements either left or right

Approach:
 I used the Reversal Algorithm to rotate the array eficiently in -place

 --LEFT ROTATE by k
   => Normalize k
      k=k%n
   => Reverse first k elements
   =>Reverse remaining n-k elements   
   =>Reverse the entire array

 --RIGHT ROTATE by k 
   =>Normalize k
   k= k % n
   =>Reverse the entire array
   =>Reverse first k elements
   =>Reverse remaining n-k elements
   
   

   Time complexity: O(n)

   Space complexity:    O(1)


*/ 



import java.util.Arrays;



public class RotateArrayByKElements {
    public static void LeftRotate(int[] arr1, int k) {
  int n = arr1.length;
        k = k % n;

        Reverse(arr1, 0, k - 1);     
        Reverse(arr1, k, n - 1);     
        Reverse(arr1, 0, n - 1);
    }
    public static void RightRotate(int[] arr2, int k){
   int n = arr2.length;
        k = k % n;

        Reverse(arr2, 0, n - 1);     
        Reverse(arr2, 0, k - 1);     
    }
    public static void Reverse(int[] arr, int start, int end){
 while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
    }}
    public static void main(String[] args) {
        

        int[]arr1 ={1,2,3,4,5,6};
        int k=2;
        // LEFT ROTATE
        LeftRotate(arr1,k);
                System.out.println("Left Rotate by 2: " + Arrays.toString(arr1));


         int[]arr2 ={1,2,3,4,5,6};
    //   RIGHT ROTATE
        RightRotate(arr2,k);
                System.out.println("Right Rotate by 2: " + Arrays.toString(arr2));


    }
    }

