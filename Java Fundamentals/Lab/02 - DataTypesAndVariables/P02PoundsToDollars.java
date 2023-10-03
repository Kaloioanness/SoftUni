package SoftUni.DataTypesAndVariables;
import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float britishPound = Float.parseFloat(scanner.nextLine());
        float course = 1.36f;
        float dollars = britishPound * course;
        System.out.printf("%.3f",dollars);

    }
}