



/* 
Problem: Check if a pairwith given sum exists in Array

Approach: 
->Use HasMap to store numbers already seen with their indices.

for each element:
1.  find required number
nedded= target-arr[i]

2.  if needed exists in map pair found
3. else store current number with index



time complexity: O(n)

space complexity: O(n)









*/ 
import java.util.HashMap;

public class TwoSum {
    
    public static int[] twoSum(int []arr, int target){

        HashMap<Integer,    Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int needed = target- arr[i];

            if (map.containsKey(needed)){
                return new int[]
                {map.get(needed),i};


            }
            map.put(arr[i],i);


        }
        return new int []{-1,-1};




    }
    public static void main(String[] args) {
        int []arr ={2,11,7,15};
        int target=9;
        int [] result= twoSum(arr, target);

        System.out.println(result[0]+ " " +result[1]);
        
    }
}
