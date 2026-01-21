

public class RemoveDuplicatFromSortedArray{
public  static int Removeduplicate(int[]arr){

   if(arr== null || arr.length==0){
    return 0;
   }
int i=0;
for(int j=1; j<arr.length; j++){
    if(arr[j]!= arr[i]){
        i++;
        arr[i]=arr[j];
    }

}
return i+1;
}
public static void main(String[] args) {
    
    int []arr={1,2,2,3,4,5,5};
    int newlength=Removeduplicate(arr);

    System.out.println("length after removing duplicate"+ newlength) ;
    for(int i=0; i<newlength; i++){
System.out.println(arr[i]+"");
    }
}
}