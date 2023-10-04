package SoftUni.SignOfIntegerNumbers;
import java.text.DecimalFormat;
import java.util.Scanner;
public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyEvenAndOdd(number));
    }
    public static int multiplyEvenAndOdd(int n){
        int evenSum = 0;
        int oddSum = 0;
        n = Math.abs(n);
        while (n > 0){
            int digit = n % 10;
            if (digit % 2 == 0){
                evenSum += digit;
            }else {
                oddSum += digit;
            }
            n /= 10;
        }
        return evenSum * oddSum;
    }
}
