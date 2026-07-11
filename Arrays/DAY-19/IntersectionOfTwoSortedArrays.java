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

    public static ArrayList<Integer> intersection(int n, int[] arr1, int[] arr2) {

       int i = 0;
int j = 0;
ArrayList<Integer> Intersection= new ArrayList<>();

while (i < arr1.length && j < arr2.length) {
    if (arr1[i] == arr2[j]) {
        Intersection.add(arr1[i]);  // ✅ Add the match
        i++;
        j++;
    }
    else if (arr1[i] < arr2[j]) {
        i++;  // ✅ arr1 needs to catch up
    }
    else {
        j++;  // ✅ arr2 needs to catch up
    }
}

return Intersection;
    }
    public static void main(String[] args) {

        Scanner Inp = new Scanner(System.in);

        System.out.println("Enter the size of Array1");
        int n = Inp.nextInt();
 System.out.println("Enter the size of Array2");
int m = Inp.nextInt();
        int[] arr1 = new int[n];

        int[] arr2 = new int[n];

        System.out.println("Enter the Elements of first Array ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Inp.nextInt();
        }

        System.out.println("Enter the Elements of first Array ");
        for (int i = 0; i < m; i++) {
            arr2[i] = Inp.nextInt();
        }

        ArrayList<Integer>Result=intersection(n, arr1, arr2);
        System.out.println("Intersection of arr1 and arr2 : " + Result);
    }
    }
