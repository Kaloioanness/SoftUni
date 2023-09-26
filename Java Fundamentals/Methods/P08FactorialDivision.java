package JavaFundamentals.Excercises.Methods;

import java.util.Scanner;

public class P08FactorialDivision  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f",(double)firstFact(n)/secondFact(m));
    }
    public static double firstFact(int n){
        double factN = 1;
        for (int i = 1; i <= n; i++) {
            factN *= i;
        }
        return factN;
    }
    public static double secondFact(int m){
        double factM = 1;
        for (int i = 1; i <= m; i++) {
            factM *= i;
        }
        return factM;
    }
}
