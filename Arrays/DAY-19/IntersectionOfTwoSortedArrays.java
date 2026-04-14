/*
--Problem: Intersection of two sorted Arrays

---Approach:
->Use Two Pointer Techniquw since both arrays are sorted 

-Initialize two pointers i and j at 0
-Traverse both arrays simultaneously

--STEPS:
1: compare arr1[i] and arr2[j]
2: if arr1[i]<arr2[j] -> move i++(skip smaller element)
3:if arr1[i]>arr2[j] -> move j++(skip smaller element)
4: if arr1[i] == arr2[j]:
 --Add element to result (only once)
 -- Move both i++ and j++
5:Avoid duplicates while adding

(Skip non-matching elements and only take common elements)

--Time complexity: O(n + m)
-we traverse both arrays once using two pointers


--Space complexity: O(k)  // for storing intersection elements     (k= number of common elements)
                  O(1)  // auxiliary space (excluding result)



*/ 
import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoSortedArrays {

    public static void intersection(int n, int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    i++;
                }
            } else if (arr1[i] > arr2[j]) {
                if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    j++;
                }
            } else {
                if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                    i++;
                    j++;
                }

            }
        }
        while(i<arr1.length){
 if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                   result.add(arr1[i]);  
        }}
    while(i<arr1.length){
 if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                   result.add(arr2[i]);  
        }
    }

        System.out.println( "Intersection" +  result);
    }
    public static void main(String[] args) {

        Scanner Inp = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = Inp.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter the Elements of first Array ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Inp.nextInt();
        }

        System.out.println("Enter the Elements of first Array ");
        for (int i = 0; i < n; i++) {
            arr2[i] = Inp.nextInt();
        }

        intersection(n, arr1, arr2);
    }
    }
