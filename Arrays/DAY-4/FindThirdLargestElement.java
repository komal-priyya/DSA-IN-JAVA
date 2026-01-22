public class FindThirdLargestElement {
    

    public static int ThirdElement(int [] arr){
   int first = Integer.MIN_VALUE;
    int  second = Integer.MIN_VALUE;
 int third = Integer.MIN_VALUE;




for(int num: arr){
    if(num > first){
        third=second;
        second= first;
        first=num;
    }
else if(num >second && num!=first ){
    third=second;
    second=num;
}
}

return third;
    }

    public static void main(String[] args) {
        int []arr={1,2,4,7,7,5};
        int result= ThirdElement(arr);
        System.out.println(result);
    }
}
