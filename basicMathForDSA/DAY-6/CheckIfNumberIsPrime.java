public class CheckIfNumberIsPrime {
    public static void isPrimeNum(int n) {

        if (n <= 1) {
            System.out.println("num is not prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("num is not prime");
                return;
            }
        }

        System.out.println("num is prime");
    }

    public static void main(String[] args) {
        int num = 47;
        isPrimeNum(num);
    }
}