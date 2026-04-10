
import java.util.Arrays;
import java.util.Scanner;



public class LinearSearch {
    public static int linearSearch(int[]arr,int n, int num){

      
        for (int i = 0; i< n; i++) {
           if(arr[i]==num){
  return i;
           }
          
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        
        Scanner Inp = new Scanner(System.in);

        System.out.println("Enter the size of Array");
int n= Inp.nextInt();

int[]arr= new int[n];

System.out.println("Enter the Elements ");
for(int i=0; i<n ; i++){
    arr[i]= Inp.nextInt();
}
System.out.println("Enter the num");
int num = Inp.nextInt();
 System.out.println( "Array : "+ Arrays.toString(arr));

 int result = linearSearch(arr,n,num);
 System.out.println("result : " + result);
    }
}
