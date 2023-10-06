package ObjectsAndClasses;
import java.math.BigInteger;
import java.util.Scanner;

public class P02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger biggieOne = new BigInteger(scanner.nextLine());
        BigInteger biggieTwo = new BigInteger(scanner.nextLine());
        BigInteger sum = biggieTwo.add(biggieOne);
        System.out.println(sum);
    }
}