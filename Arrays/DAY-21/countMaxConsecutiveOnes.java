/*
--Problem: Count Maximum consecutive one's in the array


--Approach: 
-Travese the array once
- Use the  a  variabe counter to track the current streak of  consecutive 1s
- If current element is 1:
 --> Increment the counter
 --> update  max using Math.max(max, counter)
-If current element is 0:
  --> Reset counter=0 
-After taversal,return max

counter= current consecutive 1s streak 
max= highest streak found so far


--Time Complexity: O(n)
Array is traversed once

--Space Complexity:O(1)
only used two extra variable counter, max






*/ 
import java.util.Scanner;

public class countMaxConsecutiveOnes {

    public static int findConsecutiveOnes(int[]arr, int n) {
            int max=0;
            int counter=0;

          for(int i=0; i<n; i++){
              if(arr[i]==1){
                 counter++;
                 max= Math.max(max,counter);
              }
            else{
               counter=0;
          }
          }
   return max;



    }

    public static void main(String[] args) {

        Scanner Inp = new Scanner(System.in);

        System.out.println(" Enter the size of the array");
        int n = Inp.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Inp.nextInt();

        }

        int result= findConsecutiveOnes(arr,n);
        
        System.out.println("Maximum Consecutive Ones:  " +  result);

    }
}

