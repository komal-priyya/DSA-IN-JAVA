
public class GCDOfTwoNumbers {
    
    public static int GCD(int a, int b){

        int remainder;
     

      while(b!=0){
        remainder=a%b;
        a=b;
        b=remainder;
      }
      return a;



    }
    public static void main(String[] args) {
        int a=9;
        int b=12;
        int result=GCD(a,b);
        System.out.println("the GCD of 9 , 12 is"  +  result);
    }
}
