
import java.util.Arrays;
import java.util.HashSet;


public class ContainsDuplicate {
    public static boolean DuplicateProblem(int[] nums){
HashSet<Integer> Seen= new HashSet<>();
        for(int num:nums){
if(Seen.contains(num)){
    return true;
}
Seen.add(num);
        }
        return false;
    }
    public static void main(String[]args){

        int[]nums={1,2,3,4,3};
        System.out.print(Arrays.toString(nums));
        boolean result = DuplicateProblem(nums);
        System.out.println(result);


    }
    
}
