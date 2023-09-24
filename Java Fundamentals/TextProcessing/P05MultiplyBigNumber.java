package JavaFundamentals.Excercises.TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine();
        String secondNum = scanner.nextLine();
        BigInteger firstNumber = new BigInteger(firstNum);
        byte secondNumber = Byte.parseByte(secondNum);
        System.out.println(firstNumber.multiply(BigInteger.valueOf(secondNumber)));
    }
}
