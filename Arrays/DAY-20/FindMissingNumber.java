/*
Approach: 
- The array contains numbers from 1 to n ,but one number is missing
- Instead of sorting , use a mathematical formula

STEPS
1). Calculate expected sum of numbers from  1 to n using formula:
n*(n+1)/2
2). Calculate actual sum of all the elements in the array
3). the missing number is
 missing= expected-actual
 4). Drive n using
 n=arr.length+1

 Time complexity: O(n)
we traverse the array only one o calculate sum


space complexity:O(1)
no extra space is used












*/
import java.util.Scanner;

public class FindMissingNumber {
    public static int findMissing(int []arr){
        int n= arr.length+1;
        int sum =0;

        for(int i=0;i<arr.length; i++){
            sum +=arr[i];
        }
        int expected= n*(n+1)/2;
        return expected-sum;

    }

    public static void main(String[] args) {
        

    
        Scanner Inp = new Scanner(System.in);

        System.out.println("Enter the size of Array");
int size= Inp.nextInt();

int[]arr= new int[size];

System.out.println("Enter the Elements ");
for(int i=0; i<size ; i++){
    arr[i]= Inp.nextInt();

}

int missing= findMissing(arr);
System.out.println("Missing number :"  + missing );
    }


}
