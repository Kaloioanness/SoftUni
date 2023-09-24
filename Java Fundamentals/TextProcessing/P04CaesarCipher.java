package JavaFundamentals.Excercises.TextProcessing;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int symbolInt = text.charAt(i) + 3;
            char symbol = (char)symbolInt;
            sb.append(symbol);
        }
        System.out.println(sb.toString());
    }
}
