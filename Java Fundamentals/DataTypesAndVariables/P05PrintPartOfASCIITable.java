package JavaFundamentals.Excercises.DataTypesAndVariables;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startIndex = Integer.parseInt(scanner.nextLine());
        int lastIndex = Integer.parseInt(scanner.nextLine());
        for (int i = startIndex; i <= lastIndex; i++) {
            System.out.printf("%s ", (char) i);
        }
    }

}