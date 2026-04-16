
/*Problem: Find Largest Element in an Array

   Approach:
    -> solved this problem using a linear traversal approach.
    ->Initialize a variable max with the first element of the array.
    ->Traverse the array starting from the second element.
    ->For each element:
        =>Compare it with max
         =>If the current element is greater, update max
After completing the traversal, max will contain the largest element.



Time Complexity: O(n)
we traverse the array only once 


Space Complexity: O(1)
NO EXTRA SPACE IS USED (CONSTANT SPACE)
*/


public class LargestElement {
    
public static int isLargestElement(int[] arr){
    int count=0;
int n = arr.length;
int max=arr[0];
for(int i=0;i<n;i++){
    if(arr[i] > max){
        max=arr[i];
        count++;
System.out.println("count"+count);
System.out.println(i);
    }
}
return max;
}
public static void main(String[] args) {
    int arr[]={2,9,45,6};
    int result=isLargestElement(arr);
    System.out.println("max"+result);

}
}






