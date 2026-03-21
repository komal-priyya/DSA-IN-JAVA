public class Palindrome {
    


    public static void isPalindrome(int num){
        int original=num;
        int reverse=0;
        while(num>0){
            int digit= num%10;
            reverse= reverse*10+ digit;
            num=num/10;
        }
         
if(original==reverse){
    System.out.println("num is palindrome");
}
else{
    System.out.println("num is not palindrome");
}
    }

    public static void main(String[] args) {
        int num= 1221;
     isPalindrome(num);

    }
}

