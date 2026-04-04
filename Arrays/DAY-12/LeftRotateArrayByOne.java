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
 public static void LeftRotate(int[]arr, int k){

int n= arr.length;
int temp=arr[0];
       for(int i=0;i<n;i++){
             arr[i]=arr[i+1];
           
       }
  arr[n-1]=temp;



 }  
 public static void main(String[] args) {
     
        Scanner Inp= new Scanner(System.in);

        System.out.println("Enter the size of  array");
        int n = Inp.nextInt();
int k=1; //steps
        int[]arr= new int[n];
        System.out.println("Enter the array elements");
        for(int i=0 ; i<n;i++){
       arr[i]=Inp.nextInt();


       LeftRotate(arr,k);
        }

 } 
}
