/*
 problem: Remove duplicates from Unsorted Array


 Approach:HashSet only stores unique elements — duplicates are automatically ignored on .add().

 complexity
 time complexity:O(n)
 space complexity:O(n)
 */ 


 
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateInUnsortedArray {

    public static HashSet<Integer> RemoveDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);

        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
      HashSet result=   RemoveDuplicates(nums);
      System.out.println("set: "  +   result);
    }
}
