package SoftUni.DataTypesAndVariables;
import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();
        String delimiter = scanner.nextLine();
        System.out.printf("%s%s%s", nameOne,delimiter,nameTwo);
    }
}