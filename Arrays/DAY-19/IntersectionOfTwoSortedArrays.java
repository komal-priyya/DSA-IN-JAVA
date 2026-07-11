/*
--Problem: Intersection of two sorted Arrays

---Approach:
->Use Two Pointer Techniquw since both arrays are sorted 

-Initialize two pointers i and j at 0


--STEPS:
1.Start with pointers i=0 and j=0
2.Compare arr1[i] with arr2[j]:

3.If equal → Add to result, move both i++ and j++
4.If arr1[i] < arr2[j] → Move i++ (arr1 needs to catch up)
5.If arr1[i] > arr2[j] → Move j++ (arr2 needs to catch up)

6.Continue until one pointer reaches the end


Complexity

-Time Complexity: O(n + m)

--Each array traversed once
--Total comparisons = n + m


-Space Complexity: O(1)

--Only two pointers (no extra data structures)
--Result space doesn't count



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

        int[] arr2 = new int[m];

        System.out.println("Enter the Elements of first Array ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Inp.nextInt();
        }

        System.out.println("Enter the Elements of second Array ");
        for (int i = 0; i < m; i++) {
            arr2[i] = Inp.nextInt();
        }

        ArrayList<Integer>Result=intersection(n, arr1, arr2);
        System.out.println("Intersection of arr1 and arr2 : " + Result);
    }
    }
