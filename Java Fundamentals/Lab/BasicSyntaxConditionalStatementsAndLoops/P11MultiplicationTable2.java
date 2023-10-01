package JavaFundamentals.Lab.BasicSyntaxConditionalStatementsAndLoops;
import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = m; i <= 10 ; i++) {
            int product = n * i;
            System.out.printf("%d X %d = %d\n", n, i, product);

        }
        if (m > 10){
            int product2 = n * m;
            System.out.printf("%d X %d = %d", n, m, product2);
        }
    }
}