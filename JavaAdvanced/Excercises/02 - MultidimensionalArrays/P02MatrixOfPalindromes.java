package JavaAdvanced.Excercises.MultidimensionalArrays;

import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        char ch = 'a';
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.printf("%c%c%c ",ch,ch,ch);
                char ch1 = (char)(ch + 1);
                for (int k = 1; k < c; k++) {
                    System.out.printf("%c%c%c ",ch,ch1,ch);
                    ch1++;
                }

            }
            System.out.println();
            ch++;
        }
    }
}
