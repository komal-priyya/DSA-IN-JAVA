/*
Problem:move all zeroes to the end of the array

Approach:
-> use a pointer j to track position of next non-zero elelment
->Traverse array with pointer i
-> If arr[i]!=0 , place it at arrr[j]
 and increment j
 -> After traversal fill remaining positions from j to n-1 with 0

 Time complexity:O(n)
 Space complexity:O(1);

 
*/
import java.util.Arrays;
import java.util.Scanner;



public class MoveZeroes {
    public static void moveZeroes(int[]nums, int n){
int j=0;
for(int i=0; i<n; i++){
   
    if(nums[i] != 0){
        nums[j]=nums[i];
j++;
    }
}
for(int i=j; i<n ;i++){
    nums[i]=0;
}




    }
    public static void main(String[] args) {
        
        Scanner Inp= new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n= Inp.nextInt();

        System.out.println("enter the array Elements");

        int []nums= new int [n];
    for(int i=0;i<n;i++){
nums[i]=Inp.nextInt();
    }
    moveZeroes(nums,n);
 System.out.println("Left Rotate by 2: " + Arrays.toString(nums));
        
    }
}
