/*
Problem: Find maximun Element in Array


Approach:
=>Initialize the max fiest element
=>Traverse the Array
=>compare each element with max
=>update max if a larger element is found

Time Complexity: O(n)
Space Complexity:O(1)
 */


public class MaximunElement{
    public static int FindMax(int[]arr){
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
if(arr[i]>max){
    max=arr[i];
    System.out.println("it worked");
}
        }
        return max;

    }
    public static void main(String[] args) {
        int[]arr={6,7,9,5,0};
        int result=FindMax(arr);
        System.out.println(result);
    }
}
