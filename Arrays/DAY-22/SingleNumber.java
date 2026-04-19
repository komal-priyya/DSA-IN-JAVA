

/*
Problem: Find the number tht appears once and other numbers twice

Approach:
--USE XOR (^) on all elements of the array
 since:
 -> a ^ a = 0
 ->a ^ 0 = a
 All duplicate numbers cancel each other , and the remaining is the once that appears only once


 Time complexity:O(n)


 Space complexity:O(1)


*/ 
public class SingleNumber {
public static int singlenumber(int []arr){
    int result=0;
    for(int num :arr){
        result = result ^ num;
    }
    return result;
}
public static void main(String[] args) {
   
int []arr= {1,2,1,2,8,4,5,4,5,};
         
    int result= singlenumber(arr);
    System.out.println(" The number tht appeared once is : " + result);
}
}

