
import java.util.Scanner;

public class ArmstrongNumber {

    public static void isArmstrongNumber(int num) {
        int original = num;
        int Arm = 0;
        int count = 0;

        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        while (num > 0) {
            int last_digit = num % 10;

            Arm += Math.pow(last_digit, count);
            num = num / 10;
        }
        if (original == Arm) {
            System.out.println(original + "   " + "num is Armstrong");
        } else {
            System.out.println(original + "   " + "num is not Armstrong");
        }

    }

    public static void main(String[] args) {

        // isArmstrongNumber(153);
        // isArmstrongNumber(6776);
// manually
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        isArmstrongNumber(num);

        sc.close();
    }
}
