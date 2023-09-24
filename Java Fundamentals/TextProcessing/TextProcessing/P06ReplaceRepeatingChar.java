package JavaFundamentals.Excercises.TextProcessing;

import java.util.Scanner;

public class P06ReplaceRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length() - 1; i++) {
            char currentCh = text.charAt(i);
            char nextCh = text.charAt(i + 1);
            if (currentCh != nextCh) {
                sb.append(currentCh);
            }
        }
        char last = text.charAt(text.length()-1);
        sb.append(last);
        System.out.println(sb.toString());
    }
}
