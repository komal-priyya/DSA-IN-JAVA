
public class CountAllDigitsOfNumber{
    public static int CountDigit(int N){
int counter= 0;

        while(N>0){
            
          // int  last_digit= N%10;
           
               N=N/10;
 counter++;

        }
    return counter;
        
    } 

    public static void main(String[] args) {
      int  N= 45675;
      
      int result= CountDigit(N);
      System.out.println(result       +    "result");
    }
}