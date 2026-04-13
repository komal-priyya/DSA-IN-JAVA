/*
Problem:Union of Two Sorted Arrays



Approach:
-use the Two Pointer Technique since both arrays are sorted.

--Initialize two pointers i and j at 0
--Compare elements of both arrays
--Add the smaller element to result
--If elements are equal → add only once (avoid duplicates)
--Move pointers accordingly
--After one array ends, add remaining elements from the other array


Time complexity: O(n + m)   (we traverse both arrays)
Space complexity: O(n + m)   // if storing result
O(1)       // excluding result (no extra DS used)




*/




import java.util.*;

public class UnionSortedArrays {
    public static void union(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while(i < arr1.length && j < arr2.length){

            if(arr1[i] < arr2[j]){
                if(result.size() == 0 || result.get(result.size()-1) != arr1[i]){
                    result.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if(result.size() == 0 || result.get(result.size()-1) != arr2[j]){
                    result.add(arr2[j]);
                }
                j++;
            }
            else{
                if(result.size() == 0 || result.get(result.size()-1) != arr1[i]){
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // remaining elements
        while(i < arr1.length){
            if(result.get(result.size()-1) != arr1[i]){
                result.add(arr1[i]);
            }
            i++;
        }

        while(j < arr2.length){
            if(result.get(result.size()-1) != arr2[j]){
                result.add(arr2[j]);
            }
            j++;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};

        union(arr1, arr2);
    }
}