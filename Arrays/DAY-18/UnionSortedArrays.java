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
    public static ArrayList<Integer>findUnion(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        ArrayList<Integer> Union= new ArrayList<>();

        while(i < arr1.length && j < arr2.length){

            if(arr1[i] < arr2[j]){
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j]){
                    Union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // remaining elements
        while(i < arr1.length){
            if(Union.get(Union.size()-1) != arr1[i]){
                Union.add(arr1[i]);
            }
            i++;
        }

        while(j < arr2.length){
            if(Union.get(Union.size()-1) != arr2[j]){
                Union.add(arr2[j]);
            }
            j++;
        }

     return Union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

       ArrayList<Integer> Result= findUnion(arr1, arr2);
       System.out.println("union of arr and arr2 : " + Result);
    }
}