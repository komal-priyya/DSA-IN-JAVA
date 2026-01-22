
public class FindSecondLargestElementInArray {
    
    public static int secondlargestelement(int[]arr){

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int ar:arr){
            if(ar > first){
                second=first;
                first=ar;
            } else if(ar >second && ar !=first){
                second=ar;
            }
        }
        return second;
    }

    public static void main(String[]args){

int[]arr={1,2,4,5,7};

int result=secondlargestelement(arr);
System.out.println(result);




    }
}
