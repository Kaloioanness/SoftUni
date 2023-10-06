package ObjectsAndClasses;
import java.math.BigInteger;
import java.util.Scanner;

public class P03BigFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n ; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        System.out.println(fact);
    }
}