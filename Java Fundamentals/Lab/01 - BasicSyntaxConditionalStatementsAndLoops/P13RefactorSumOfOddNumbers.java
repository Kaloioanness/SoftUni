package JavaFundamentals.Lab.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int currentNumber = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(currentNumber);
            sum += currentNumber;
            currentNumber += 2;
        }
        System.out.printf("Sum: %d\n", sum);
    }
}