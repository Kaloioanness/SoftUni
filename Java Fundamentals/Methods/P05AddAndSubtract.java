package JavaFundamentals.Excercises.Methods;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int result = sum(a,b) - subtract(c);
        System.out.println(result);

    }
    public static int sum(int a, int b){

        return a + b;
    }
    public static int subtract (int c){

        return c;
    }
}
